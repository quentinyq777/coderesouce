//扩展easyui表单的验证
$.extend($.fn.validatebox.defaults.rules, {
    zipcode: {
        validator: function (value) {
            var reg = /^[0-9]*$/;
            return reg.test(value);
        },
        message: '请输入数字.'
    }
})