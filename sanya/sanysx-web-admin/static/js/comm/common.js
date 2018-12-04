var constants = {
		MSG_TIPS: '提示信息',
		CHECK_EMPTY:'请选择一条记录',
		VALIDATE_FIAL:'校验不通过',
		TIPS_DEL:"确定要删除吗?",
		TIPS_PAYFINISH:'确定要【现金】支付完成吗?',
		TIPS_ORDERCANCEL:'确定要取消订单吗?',
		TIPS_SUCCESS:'确定要删除吗?',
		TIPS_UNDO:'撤销操作'
			
  }
function gwclist(){
	var urlloguser = getRootPath() +'/fpcoustromer/getSession';
	$.ajax({
	    url:urlloguser,
	    type:'get',    
	    dataType:'json',
	    success:function(data) { 
	    	if(data.userName==null){
	    		alert("亲，请登录商城后在进入购物车查询！");  
	    		var url = getRootPath() + "/fpkf/huiyuanlogin.html";
				location.href = url;
		    }else{
		    	var url = getRootPath() + "/html/shangpin/shoppingCard.html";
				location.href = url;
		    }
	     },    
	     error : function() {    
             alert("还请您拨打:4007775669进行通知1111!");    
	     } 
    });
}
function getRootPath() {
    //获取当前网址，如： http://localhost:9099/train/html/....
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，http://localhost:9099
    var localhostPath = curWwwPath.substring(0, pos);
    //获取带"/"的项目名，/train
    return localhostPath;
}

function getRootPath() {
    //获取当前网址，如： http://localhost:9099/train/html/....
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，http://localhost:9099
    var localhostPath = curWwwPath.substring(0, pos);
    //获取带"/"的项目名，/train
    var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
    return(localhostPath + projectName);
}

function getRootPath1() {
    //获取当前网址，如： http://localhost:9099/html/....
    var curWwwPath = window.document.location.href;
    //获取主机地址之后的目录，
    var pathName = window.document.location.pathname;
    var pos = curWwwPath.indexOf(pathName);
    //获取主机地址，http://localhost:9099
    var localhostPath = curWwwPath.substring(0, pos);
    return(localhostPath);
}
// 复选框单选
function cb(v) {
	$("input[name='cid']").each(function() {
		if ($(this).val()==v) {
			$(this).attr("checked", true);
        }else{
        	$(this).attr("checked", false);
        }
	});
}
//解析URL的参数
function getUrlPara(url) {
	var get = url.split("?")[1];
	//得到当前网页的URL 
	var para = null;
	//为了防止当页面没有外部变量时程序出错，因此将para的值设为空 
	if (get != null && get.length > 0) {
		para = get.split("&");
	}
	//以“&”为分割符获得变量字符串 
	var map = {};
	for (i = 0; para != null && i < para.length; i++) {
		var vars = para[i].split("=");
		map[vars[0]] = vars[1];
	}
	return map;
}

function submitOper(url, data) {
	$.ajax({
		url : url,
		type : "post",
		async : true,
		data : data,
		//contentType : 'application/json;charset=UTF-8',  
		dataType : "text",
		//timeout:"10000",  设置加载时间，超出时间为错误
		//error:function(){alert("服务加载出错");},  
		success : function(result) {
			if (result == "FAIL") {
				alert("服务加载出错");
			} else {
				query();
			}
		}
	});
}

function trim(str){ //删除左右两端的空格
    return str.replace(/(^\s*)|(\s*$)/g, "");
}

function getUrlTime() {
    var curr_time = new Date();   
	var strDate = "";
//		curr_time.getFullYear();
//	if ((curr_time.getMonth()+1)<10) {
//		strDate += "0"+(curr_time.getMonth()+1);
//	} else {
//		strDate += ""+(curr_time.getMonth()+1);   
//	}
//	
//	if (curr_time.getDate()<10) {
//		strDate += "0"+curr_time.getDate();
//	} else {
//		strDate += ""+curr_time.getDate();
//	}
//	
//	if (curr_time.getHours()<10) {
//		strDate += "0"+curr_time.getHours();
//	} else {
//		strDate += ""+curr_time.getHours(); 
//	}
	
	if (curr_time.getMinutes()<10) {
		strDate += "0"+curr_time.getMinutes();
	} else {
		strDate += ""+curr_time.getMinutes(); 
	}
	
	if (curr_time.getSeconds()<10) {
		strDate += "0"+curr_time.getSeconds();
	} else {
		strDate += ""+curr_time.getSeconds(); 
	}
	return strDate;
}

function orderstatus(value){
	if (value == '00') {
		return "订单录入完成";
	} else if (value == '01') {
		return "金额录入完成";
	 } else if (value == '02') {
		return "支付完成";
	}else if (value == '03') {
		return "取消";
	}else  {
		return "未知";
	}
}

function diststatus(value){
	if (value == '00') {
		return "订单录入完成";
	} else if (value == '10') {
		return "店长分配订单";
	 } else if (value == '20') {
		return "接收订单";
	}else if (value == '30') {
		return "到店";
	}else if (value == '40') {
		return "出店";
	}else if (value == '50') {
		return "成功";
	}else if (value == '4310') {
		return "确认送衣时间";
	}else if (value == '4320') {
		return "取衣到店";
	}else if (value == '4330') {
		return "取衣出店";
	}else if (value == '4410') {
		return "确认取回工具时间";
	}else if (value == '4420') {
		return "已取回";
	}else  {
		return "未知";
	}
}

function buytype(value){
	if (value == 'A1') {
		return "商超代购";
	} else if (value == 'A2') {
		return "药店代购";
	 } else if (value == 'A3') {
		return "洗衣服务";
	 } else if (value == 'A4') {
		return "工具租赁";
	 } else if (value == 'A5') {
		return "外卖代购";
	 } else if (value == 'B1') {
		return "保洁";
	 }  else if (value == 'B2') {
		return "维修";
	 } else if (value == 'B3') {
		return "开锁换锁";
	 } else if (value == 'B4') {
		return "叫快递";
	 }else if (value == 'C1') {
		return "6.1大礼包";
	 }else if (value == 'C2') {
		return "周末营";
	 }else if (value == 'S1') {
			return "商超私人定制";
		} else if (value == 'S2') {
			return "药店私人定制";
		 } else if (value == 'S3') {
			return "洗衣私人定制";
		 } else if (value == 'S5') {
			return "外卖私人定制";
		 }else  {
		return "未知";
	}
}

function paytype(value){
	if (value == '1') {
		return "微信支付";
	} else if (value == '2') {
		return "现金支付";
	 } else  {
		return "未支付";
	}
}

function source(value){
	if (value == '1') {
		return "正常下单";
	} else if (value == '2') {
		return "手动添加";
	 } else  {
		return "未知";
	}
}

function auditstatus(value){
	if (value == '00') {
		return "初始状态";
	} else if (value == '10') {
		return "待审核";
	 } else if (value == '20') {
		return "审核通过";
	 } else if (value == '30') {
		return "审核失败";
	 } else  {
		return "未知";
	}
}

function textboxhide(id){
	$("#"+id+"+.textbox").hide();
}


function MoveUp(gridname) {
    var row = $('#' + gridname).datagrid('getSelected'); 
    var index = $('#' + gridname).datagrid('getRowIndex', row);
    mysort(index, 'up', gridname);
}

//下移
function MoveDown(gridname) {
    var row = $('#' + gridname).datagrid('getSelected');
    var index = $('#' + gridname).datagrid('getRowIndex', row);
    mysort(index, 'down', gridname);
}

function mysort(index, type, gridname) {
    if ("up" == type) {
        if (index != 0) {
            var toup = $('#' + gridname).datagrid('getData').rows[index];
            var todown = $('#' + gridname).datagrid('getData').rows[index - 1];
            $('#' + gridname).datagrid('getData').rows[index] = todown;
            $('#' + gridname).datagrid('getData').rows[index - 1] = toup;
            $('#' + gridname).datagrid('refreshRow', index);
            $('#' + gridname).datagrid('refreshRow', index - 1);
            $('#' + gridname).datagrid('selectRow', index - 1);
        }
    } else if ("down" == type) {
        var rows = $('#' + gridname).datagrid('getRows').length;
        if (index != rows - 1) {
            var todown = $('#' + gridname).datagrid('getData').rows[index];
            var toup = $('#' + gridname).datagrid('getData').rows[index + 1];
            $('#' + gridname).datagrid('getData').rows[index + 1] = todown;
            $('#' + gridname).datagrid('getData').rows[index] = toup;
            $('#' + gridname).datagrid('refreshRow', index);
            $('#' + gridname).datagrid('refreshRow', index + 1);
            $('#' + gridname).datagrid('selectRow', index + 1);
        }
    }
}
function toDecimal2(x) {    
    var f = parseFloat(x);    
    if (isNaN(f)) {    
        return false;    
    }    
    var f = Math.round(x*100)/100;    
    var s = f.toString();    
    var rs = s.indexOf('.');    
    if (rs < 0) {    
        rs = s.length;    
        s += '.';    
    }    
    while (s.length <= rs + 2) {    
        s += '0';    
    }    
    return s;    
} 

function openImg(imgurl) {
	window.open(imgurl,"","modal=yes,width=1000,height=700,resizable=no,scrollbars=no")
}