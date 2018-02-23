console.log("main");


$("#btnTest").click(function(){

    $.ajax(
        {
          type: "POST",
          url: "/post/test",
          data: {
                        str: "this is a test"
                    },
          success: function(data, status, xhr){
                           console.log(data);

                           var dataObject = JSON.parse(data);
                           console.log(dataObject);
                       },

          dataType: "text"
        }
    );

});