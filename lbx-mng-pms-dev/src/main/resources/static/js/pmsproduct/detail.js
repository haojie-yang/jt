
var options={
    detail:{
        elem:'#LAY-app-detail',
        toolbar:'#detailToolbar',
        labelWidth:'120px',
        data:responseResult,
        edit:event=='show'?false:true,
         date:[
             {
                 elem:"#test5",
                 type: 'datetime'
             },
             {
                 elem:"#modificationTime",
                 type: 'datetime'
             }
         ]
    }
};
$(function () {
    lbx.init(options);
});

