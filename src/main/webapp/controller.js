(function() {
	angular
		.module('springMybatis')
		.controller('indexController', indexController);

	/** @ngInject */
	function indexController($log) {
		var vm=this;
		vm.name="哈哈";
		$log.info("调用成功");
	}
})();