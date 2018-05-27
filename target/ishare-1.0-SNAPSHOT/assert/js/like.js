/* @author:Starrier
 * 动态点赞
 * 此效果包含css3，部分浏览器不兼容（如：IE10以下的版本）
 */
$(function() {
    $("#praise").click(function() {
        var praise_img = $("#praise-img");
        var text_box = $("#add-num");
        var praise_txt = $("#praise-txt");
        var num = parseInt(praise_txt.text());
        if (praise_img.attr("src") == ('like.png')) {
            $(this).html("<img src='unlike.png' id='praise-img' class='animation' />");
            praise_txt.removeClass("hover");
            text_box.show().html("");
            $(".add-animation").removeClass("hover");
            num -= 1;
            praise_txt.text(num)
        } else {
            $(this).html("<img src='like.png' id='praise-img' class='animation' />");
            praise_txt.addClass("hover");
            text_box.show().html("");
            $(".add-animation").addClass("hover");
            num += 1;
            praise_txt.text(num)
        }
    });
})