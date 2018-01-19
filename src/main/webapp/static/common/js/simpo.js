/*
 * SIMPO Javascript
 * 内容：
 * JQuery扩展（ajax处理、表单序列化）
 * 字符串处理
 * 日期处理（日期格式化）
 * 表单处理（获取table数据、初始化select、分页处理）
 */

/* JQuery扩展 begin */
(function($) {
	/**
	 * Ajax 请求权限异常
	 * 用户权限错误跳转登陆页
	 * 404错误跳转404页面
	 */
	$(document).ajaxComplete(function(evt, req, settings){
	    // TODO
	});

	$.extend({
		/**
		 * ajax 共同方法 POST 请求方式提交，返回"text" 类型数据 调用方法 同步：var data =
		 * $.ajaxPost(url,params); 异步 $.ajaxPost(url,params,function(data){});
		 * 
		 * @param url
		 *            请求url
		 * @param opt
		 *            请求配置，不配置默认使用内置配置信息 { params: 参数 async: 请求方式：true异步，false同步
		 *            timeout: 超时时间 complete: 请求结束回调 success: 请求成功回调 error:
		 *            请求错误回调 }
		 */
		ajaxPost : function(url, opt) {
			var option = $.extend({
				params: "",					// 参数
				async: true,				// 请求方式：true异步，false同步
				timeout: 30000,				// 超时时间
                complete: function(xhr, textStatus) {
				},							// 请求结束回调
                success: function(data) {
					return data;
				},							// 请求成功回调
                error: function(err) {
					alert(err);
				}							// 请求错误回调
                // 不足是否填充
            }, opt || {});
			
			$.ajax({
				type : "POST",
				url : ctx + option.url, // 请求url
				data : option.params == null ? "" : option.params, // 请求参数
				cache : false, // 缓存
				async : option.async, // 请求方式
				timeout : option.timeout, // 超时时间
				success : option.success, // 请求成功回调
				error : option.error, // 请求错误回调
				complete : option.complete // 请求结束回调
			});

		}
	})
})(jQuery);

/**
 * 重写jquery 的 serializeArray 方法 去除过滤disabled的条件
 * 
 * @returns {*}
 */
$.fn.formSerializeArray = function () {
    var rCRLF = /\r?\n/g,
        rinput = /^(?:color|date|datetime|datetime-local|email|hidden|month|number|password|range|search|tel|text|time|url|week)$/i,
        rselectTextarea = /^(?:select|textarea)/i;

    return this.map(function () {
        return this.elements ? jQuery.makeArray(this.elements) : this;
    }).filter(function () {
        return this.name && ( this.checked || rselectTextarea.test(this.nodeName) || rinput.test(this.type) );
    }).map(function (i, elem) {
        var val = jQuery(this).val();
        return val == null ?
            null :
            jQuery.isArray(val) ?
                jQuery.map(val, function (val, i) {
                    return {name: elem.name, value: val.replace(rCRLF, "\r\n")};
                }) :
            {name: elem.name, value: val.replace(rCRLF, "\r\n")};
    }).get();
}

/**
 * 重写Jquery的serialize方法，因为默认的序列化方法，剔除了disabled的控件
 * 
 * @returns {*}
 */
$.fn.formSerialize = function () {
    return jQuery.param(this.formSerializeArray());
};
/* JQuery扩展 end */

/* 字符串处理 begin */
/* 字符串处理 end */

/* 日期处理 begin */
/**
 * 对Date的扩展，将 Date 转化为指定格式的String 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
 * 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字) 例子： (new
 * Date()).Format("yyyy-MM-dd HH:mm:ss.S") ==> 2006-07-02 08:09:04.423 (new
 * Date()).Format("yyyy-M-d H:m:s.S") ==> 2006-7-2 8:9:4.18
 * 
 * @param fmt
 *            日期格式
 * @return 返回指定日期格式的字符串
 */
Date.prototype.Format = function (fmt) {
 var o = {
     "M+": this.getMonth() + 1,                 // 月份
     "d+": this.getDate(),                    // 日
     "H+": this.getHours(),                   // 小时
     "m+": this.getMinutes(),                 // 分
     "s+": this.getSeconds(),                 // 秒
     "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
     "S": this.getMilliseconds()             // 毫秒
 };
 if (/(y+)/.test(fmt))
     fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
 for (var k in o)
     if (new RegExp("(" + k + ")").test(fmt))
         fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
 return fmt;
}
/* 日期处理 end */

/* 表单处理 begin */
/**
 * 获得子表格数据
 * 
 * @param tableId
 *            表格ID
 * @param obj
 *            后台子表别称
 * @return 例如 "obj=xxx&obj2=xxx"
 */
function getSubTableData(tableId, obj) {
    var m = {
        xType: ["input", "textarea", "select"],
        inputType: ["text", "password", "radio", "checkbox", "hidden"]
    };
    var resultStr = "";
    $("#" + tableId + " > tbody > tr").each(function (index, item) {
        $.each($(this).find("input,textarea,select"), function () {
            var ed = $(this);
            var keyName = ed.attr("name");
            $.each(m.xType, function (i, n) {
                if (ed.is(n)) {
                    if (n == "input") {
                        if (ed.is(":input[type='text']")
                            || ed[0].type.toLowerCase() == "text"
                            || ed.is(":input[type='password']")) {
                            resultStr += obj + "[" + index + "]." + keyName + "=" + ed.val() + "&";

                        } else if (ed.is(":input[type='checkbox']")
                            || ed.is(":input[type='radio']")) {
                            if (ed.is(":checked")) {
                                resultStr += obj + "[" + index + "]." + keyName + "=" + ed.val() + "&";
                            }
                        } else if (ed.is(":input[type='hidden']")) {
                            resultStr += obj + "[" + index + "]." + keyName + "=" + ed.val() + "&";
                        }
                    }
                    if (n == "textarea") {
                        resultStr += obj + "[" + index + "]." + keyName + "=" + ed.val() + "&";
                    }
                    if (n == "select") {
                        resultStr += obj + "[" + index + "]." + keyName + "=" + ed.val() + "&";
                    }
                }
            });
        });
    });
    return resultStr.substring(0, resultStr.length - 1);
}

// 打开一个窗体
function windowOpen(url, name, width, height){
    var top=parseInt((window.screen.height-height)/2,10),left=parseInt((window.screen.width-width)/2,10),
        options="location=no,menubar=no,toolbar=no,dependent=yes,minimizable=no,modal=yes,alwaysRaised=yes,"+
            "resizable=yes,scrollbars=yes,"+"width="+width+",height="+height+",top="+top+",left="+left;
    window.open(url ,name , options);
}

/**
 * 分页共通
 * 
 * @param url
 *            请求的url
 * @param condition
 *            请求的参数
 * @param pageNum
 *            当前页
 * @param result
 *            结果所 填充的Div 返回的html代码
 * @param callback
 *            请求完成的回调函数
 */
function commonPagination(url, condition, pageNum, result, callback) {
    if (typeof (condition) == "undefined" || condition == null)
        condition = {};
    var res = "#searchResult";
    if (result != undefined) {
        res = result;
    }
    var java_pager_pageSize = 10;

    if ($(res).find("input[name='java_pager_pageSize']").length > 0) // 每页条数
    {
        java_pager_pageSize = $(res).find("input[name='java_pager_pageSize']").val();
    }

    $.ajaxPost(url, {
		params: $.extend(condition, {
            pageNow: pageNum,
            pageSize: java_pager_pageSize
        }),
        success: function (data) {
            $(res).html(data);
        },
        complete: function (XMLHttpRequest, textStatus) {
            if (callback && typeof(callback) == "function") {
                callback();
            }
        }
    });
}
/* 表单处理 end */


/* bootstraptable begin */
$(function ($) {
    'use strict';

    if ($.fn.bootstrapTable) {
	    $.extend($.fn.bootstrapTable.defaults, {
	    	pageSize:10,
	    	pageList:[10, 25, 50, 100],
	    	elId:null,
	        autoHeight: true,
	    	onPostBody:function(){
	    		if (this.autoHeight && this.elId) {
	    			setBootStrapTableHeight("#"+this.elId);
	    			bootStrapTableResize("#"+this.elId);
	    		}
	    	}
	    });
	    
	    var BootstrapTable = $.fn.bootstrapTable.Constructor,
	        _initTable = BootstrapTable.prototype.initTable;
	
	    BootstrapTable.prototype.initTable = function() {
	        var that = this;
	        _initTable.apply(this, Array.prototype.slice.apply(arguments));
	
	        this.options.elId = that.$el[0].id;
	    };
    }
});
/**
 * bootstraptable高度随内容变化
 * @param tableId 表格ID
 */
function bootStrapTableResize(table) {
	$(window).resize(function() {
		setBootStrapTableHeight(table);
	});
}
/**
 * bootstraptable高度随内容变化
 * @param tableId 表格ID
 */
function setBootStrapTableHeight(table) {
	var height = $(table).outerHeight(true);
	$(table).parent().height(height);//.height()+17);
	//$(table).parent().parent().height($(table).parent().outerHeight(true)+10);
	$(table).parent().height(height+height-$(table).parent()[0].clientHeight);
}
/* bootstraptable end */
