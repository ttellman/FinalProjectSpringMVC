 $(document).ready(function() {
     $('#ibutton').click(function(e) {
     e.preventDefault();
     var ajaxdata = $("#country").val();
     var value ='county='+ajaxdata;
 
     $.ajax({
     url: "saveIt",
     //type: "post",
     data: value,
     cache: false,
     success: function(data) {
     $("#country").val('');
     $("#message").html(data).slideDown('slow');
     }
     });
});
});