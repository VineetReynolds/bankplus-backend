'use strict';

angular.module('bankPlusApp').factory('withdrawalResource', function($resource){
    var resource = $resource('/bankplus/rest/customers/:customerId/withdrawals/:withdrawalId',{withdrawalId:'@id'},{'queryAll':{method:'GET',isArray:true},'query':{method:'GET',isArray:false}});
    return resource;
});
