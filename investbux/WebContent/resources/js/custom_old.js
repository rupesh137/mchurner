$(document).ready(function(){

    // show and hide forms

    $('.btn-fp').on('click', function(){
        $('.sign-up-form, .sign-in-form').css('display', 'none');
        $('.forgot-pass-form').css('display', 'block');

    });
    $('.btn-signup').on('click', function(){
        $('.sign-in-form, .forgot-pass-form').css('display', 'none');
        $('.sign-up-form').css('display', 'block');
    });
    $('.btn-signin').on('click', function(){
        $('.forgot-pass-form, .sign-up-form').css('display', 'none');
        $('.sign-in-form').css('display', 'block');
    });

    $('td').each(function() {
    if($(this).hasClass('vtech-approve')){
        $(this).next().next().find("a.vtech-edit").hide();
        $(this).next().next().next().find("a.vtech-delete").hide();

    }else{

    }
   });
                // view Model
                $('.vtech-view').on('click', function(){
                    $('.viewReimb').modal();
                   $('.viewReimb').find('input').prop('readonly', true);
                   $('.viewReimb').find('.chips').prop('readonly', true);
                });

                // Date Picker Initialization
                $('.datepicker').datepicker();
    
                // Open Model function
                $('table tr td a.vtech-reject').on('click', function () {
                    $('.rejectmodel').modal();
                });
                // Edit Table Row
                $('.vtech-edit').on('click', function () {
                    $('.editReimb').modal();
                });
    
                // file uploads
                $('.chips-placeholder').material_chip({
                    placeholder: 'Add More File',
                    secondaryPlaceholder: 'Browse File',
                    data: [{
                        tag: 'sample-bill.jpg',
                    }]
                });
    
                $('div.chips-placeholder input.input').attr('placeholder', 'Upload Bills');
                $('div.chips-placeholder input.input').attr('type', 'file');
                console.log('hello');
                
                // Approval
                $('a.btn.vtech-approve').click(function () {
                    var test1 = $(this);
                    swal({
                        title: 'Are you sure?',
                        text: 'You will not be able to recover this data!',
                        type: 'warning',
                        showCancelButton: true,
                        confirmButtonColor: '#99b625',
                        confirmButtonText: 'Yes, Approve!',
                        cancelButtonText: 'No, Cancel!',
                        closeOnConfirm: false,
                        closeOnCancel: false
                    },
                        function (isConfirm) {
                            if (isConfirm) {
                                swal('Approved!', 'Your Data has been Approved Successfully!', 'success');
                                test1.text('Approved');
                                test1.addClass('disabled');
                                test1.closest('td').next('td').find('a.btn.vtech-reject').hide();
    
                            } else {
                                swal('Cancelled', 'Your Data is not approved :)', 'error');
                            }
                        });
                });

                //Delete Table Row 
                $('.vtech-delete.delete-row').click(function () {
                    var test = $(this);
                    swal({
                        title: 'Are you sure?',
                        text: 'You will not be able to recover this data!',
                        type: 'warning',
                        showCancelButton: true,
                        confirmButtonColor: '#DD6B55',
                        confirmButtonText: 'Yes, delete it!',
                        cancelButtonText: 'No, cancel it!',
                        closeOnConfirm: false,
                        closeOnCancel: false
                    },
                        function (isConfirm) {
                            if (isConfirm) {
                                swal('Deleted!', 'Your Data has been Deleted!', 'success');
                                test.parent().parent().remove();
    
                            } else {
                                swal('Cancelled', 'Your Data is safe :)', 'error');
                            }
                        });
                });

                // new

                    // input box validation
                    var text_max = 32;

                    $('#count_message').html(text_max + ' Remaining');
                    
                    $('.formTitle').keyup(function() {
                    var text_length = $('.formTitle').val().length;
                    var text_remaining = text_max - text_length;
                    
                    $('#count_message').html(text_remaining + ' Remaining');
                    });
                    $('#count_message').html(text_remaining + ' Remaining');
                
});

// editing
$(document).ready(function() {
    var char_max = 32;
    var char_length = $('#efrmtitle').val().length;
     var char_remaining = char_max - char_length;
    $('#count_message1').html(char_remaining + ' Remaining');

 $('#efrmtitle').keyup(function() {
        var char_length = $('#efrmtitle').val().length;
        var char_remaining = char_max - char_length;

        $('#count_message1').html(char_remaining + ' Remaining');
    });
   
});