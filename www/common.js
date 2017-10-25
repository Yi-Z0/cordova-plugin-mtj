var exec = require('cordova/exec');

exports.pageStart = function(name) {
    exec(function(){}, function(){}, "MTJPlugin", "pageStart", [name]);
};
exports.pageEnd = function(name) {
    exec(function(){}, function(){}, "MTJPlugin", "pageEnd", [name]);
};
exports.event = function(label,desc) {
    exec(function(){}, function(){}, "MTJPlugin", "event", [label,desc]);
};
