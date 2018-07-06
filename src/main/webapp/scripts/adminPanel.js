/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var videoMetadata = null;
var videoData = null;

function finalizeUpload()
{
    if (videoMetadata == null || videoData == null)
    {
        console.log("One or the other data missing!!");

        return;
    }

    //console.log(JSON.stringify(videoData));
    // console.log(JSON.stringify(videoMetadata));


    var final_data = "{\"OmdbVideoFull\":" + JSON.stringify(videoData) + ",\"VideoMetadata\":" + JSON.stringify(videoMetadata[0]) + "}";
    //  console.log(final_data);
    console.log(final_data);
    $.ajax({
        type: "POST",
        url: "webapi/admin/addvideo/complete",
        data: final_data,
        success: function (x) {
            console.log(JSON.stringify(x));
        },
        error: function (x) {
           // alert(x.toString());
            console.log(x);
        },
        dataType: "json",
        contentType: "application/json"
    });
}

