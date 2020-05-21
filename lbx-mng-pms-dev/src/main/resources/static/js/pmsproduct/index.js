var options= {
    search:{
        elem: '#LAY-app-search',
        listId: 'LAY-app-list',
        url:'list'
        // advancedSearchId:'LAY-app-advancedSearch'
    },
    // advancedSearch:{
    //     elem: '#LAY-app-advancedSearch',
    //     callbackListId: 'LAY-app-list'
    // },
    list: {
        elem: '#LAY-app-list',
        url: 'list',
        method:'get',
        cols: [
            [
                {type: 'checkbox', fixed: 'left'},
                {field: 'product_code',title: '产品代码',width: '13%'},
                {field: 'product_name',title: '产品名称',width: '13%'},
                {field: 'responsible_department',title: '归属责任部门',width: '13%',
                    templet: function (data) {
                        if(data.responsible_department == 1){
                            return '运维实施部'
                        }
                        if(data.responsible_department == 2){
                            return '系统开发部'
                        }
                        if(data.responsible_department == 3){
                            return '系统研发部'
                        }
                        if(data.responsible_department == 4){
                            return '数据研究部'
                        }
                    }
                    },
                {field: 'product_type',title: '产品状态',width: '13%',
                    templet: function (data) {
                        return data.product_type == 1 ? '启动':'已下线'
                    }},
                {field: 'business_type',title: '业务分类',width: '13%',
                    templet: function (data) {
                        if(data.business_type == 1){
                            return '企业管理'
                        }
                        if(data.business_type == 2){
                            return '新零售业务'
                        }
                        if(data.business_type == 3){
                            return '星火业务'
                        }
                        if(data.business_type == 4){
                            return '业务运营管理'
                        }
                        if(data.business_type == 5){
                            return '智能决策支持'
                        }
                    }},
                {field: 'remark',title: '备注说明',width: '13%'},
                {toolbar: '#listRowToolbar', title: '操作', align: 'center', width: '18.5%',fixed:"right"}
            ]
        ]
        ,toolbar: '#listToolbar'
        ,queryParams: function (params) {
            return params;
        },
        detail:{
            area:['1000px','429px'],
            addArea:['1000px','333px']
        }
    }
};
$(function () {
    lbx.init(options);
});
