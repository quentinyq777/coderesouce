var activemodel = 'dev'
var devpath = "http://localhost:8100/"
var testpath = "http://localhost:8100/"
var productpath = "http://localhost:8100/"
	
function getRootPath() {
    if (activemodel == 'dev') {
    	return devpath;
    } else if (activemodel == 'test') {
    	return testpath;
    } else if (activemodel == 'product') {
    	return productpath;
    }
}

function setCookie(tokenvalue) {
	$.cookie('token', tokenvalue, { expires: 1, path: '/' });
}

function delCookie() {
	$.cookie('token', '',{ expires: 1, path: '/' });
}

function getHeader() {
	if ($.cookie('token') == undefined) {
		return '';
	}
	return $.cookie('token');
}