$(document).ready(function() {
    $('#addToCartBTN').click(function(e){
           e.preventDefault();

    var ajaxTitle = $('input.title').val;
    var ajaxRating = $('input.rating').val;
    var ajaxDescription = $('input.rating').val;
    var ajaxRate = $('input.rentalrate').val;

    var value = 'title'+ajaxTitle + 'rating' + ajaxRating + 'description' + ajaxDescription + 'rate' + ajaxRate;

    $.ajax({
        url: '/add',
        type: 'post',
        data: value,
        sucess: function(){
            alert(value + 'added to cart');
        }
    })
return false;




    });
});