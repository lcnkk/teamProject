<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/client/css/style.css" rel="stylesheet" />
<title>mainIndex.jsp</title>

</head>
<body>
    <div id="container" >
        <p>
            <h5>[ div : container ]</h5>
            <img src="resources/image/logo.png" id="main_logo">
            <h5 id="top_menu"><a href="#">LOGIN</a> | <a href="#">JOIN</a></h5>
        </p>
        <header id="header">
            <h5>[ header : header ]</h5>
            <img src="resources/image/logo_pull.png" id="banner_logo">
        </header>

        <nav id="menubar">
            <!--<h5>[ nav : menubar ]</h5>-->
            <ul>
                <!-- 새 창으로 열기 target="_blank" -->
                <li><a href="#">New</a></li>
                <li><a href="#">Weather</a></li>
                <li><a href="#">Outer</a></li>
                <li><a href="#">Top</a></li>
                <li><a href="#">Dress</a></li>
                <li><a href="#">Pants</a></li>
                <li><a href="#">Skirts</a></li>
            </ul>
        </nav>
        <section id="weather">
            <article id="main">
                <h5>[ section : weather ]</h5>
                today weather
            </article>
            <article id="keyword">
                Best Keyword
                <ol type="1">
                    <li>Keyword_1</li>
                    <li>Keyword_2</li>
                    <li>Keyword_3</li>
                    <li>Keyword_4</li>
                    <li>Keyword_5</li>
                </ol>
            </article>
        </section>
        <section id="best">
            <article>
                <h5>[ section : best ]</h5>
            </article>
            <table id="item">
                <tr>
                    <td id="item_1">item1</td>
                    <td id="item_1">item2</td>
                    <td id="item_1">item3</td>
                    <td id="item_1">item4</td>
                    <td id="item_1">item5</td>
                </tr>
                <tr>
                    <td id="item_1">item6</td>
                    <td id="item_1">item7</td>
                    <td id="item_1">item8</td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </section>
        <section id="middle">
            <section id="contents">
                <h5>[ section : contents ]</h5>
                <dl>
                    <dd>- padding : 테두리와 글씨간의 여백</dd>
                    <dd>- margin : 제목과 다른 요소 사이의 여백</dd>
                    <dd>- letter-spacing : 행간 조정</dd>
                    <dd>- text-align : 텍스트 정렬</dd>
                    <dd>- text-justify : 정렬 시 공백 조정 [ auto | none | inter-word | distribute ]</dd>
                    <dd>- text-indent : 텍스트 들여쓰기 [ 크기 | 백분율 ]</dd>
                    <dd>- line-height : 줄 간격 조정 [ normal | 숫자 | 크기 | 백분율 | inherit ]</dd>
                    <dd>- text-overflow : 넘치는 텍스트 [ clip | ellipsis ]</dd>
                    <dd>- white-space : [ nowrap : 줄바꿈 안함 ] </dd>
                    <dd>>>> hover에 overflow:visible; 작성 시 보여줄 수 있음</dd>
                </dl>
            </section>

            <aside id="side">
                <h5>[ aside : side ]</h5>
                - list 속성
                <ul>
                    <li>list-style-position : inside<br>목록 들여쓰기</li>
                </ul>
                <dl>
                    <dd>- background-attachment : [ scroll : 스크롤(기본값) | fixed : 배경 이미지 고정 ]</dd>
                </dl>
            </aside>
        </section>
        <div id="footer">
            <h4 id="footer_logo">" LOGO "</h4>
            <h5>[ div : footer ]</h5>
            <ul id="info">
                <li>Instagram : </li>
                <li>Phone : </li>
                <li>Name : </li>
                <li>Location : </li>
            </ul>
        </div>
    </div>
</body>