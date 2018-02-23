console.log("main");

$("#btnTest").click(function(){
    var url = "/post/test";
    var postData = {
        data: "this is a test"
    };
    var success = function(data, status, xhr){
        console.log(data);
    };
    $.ajax({
      type: "POST",
      url: url,
      data: postData,
      success: success,
      dataType: "json"
    });

});