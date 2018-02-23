console.log("main");

function togglePin(pinNumber) {
     $.ajax(
            {
              type: "GET",
              url: "/toggle/pin/" + pinNumber,
              success: function(data, status, xhr){
                               console.log(data);
                           },
            }
        );
}
$(document).on('keypress', function(e) {
    if(e.which == 49) {
        togglePin(0);
    } else if(e.which == 50) {
        togglePin(1);
    } else if(e.which == 51) {
        togglePin(2);
    } else if(e.which == 52) {
        togglePin(3);
    }
});

$("#toggle_pin_0").click(function(){
    togglePin(0);
});

$("#toggle_pin_1").click(function(){
    togglePin(1);
});

$("#toggle_pin_2").click(function(){
    togglePin(2);
});

$("#toggle_pin_3").click(function(){
    togglePin(3);
});