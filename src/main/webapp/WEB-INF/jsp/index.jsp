<%@ page contentType = "text/html; charset = utf-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<!DOCTYPE html>
<html <%--lang="en"--%>>
<head>
    <title>AquaOne</title>
    <%--<meta charset="utf-8">--%>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="OneTech shop project">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="/resources/styles/bootstrap4/bootstrap.min.css">
    <link href="/resources/plugins/fontawesome-free-5.0.1/css/fontawesome-all.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" type="text/css" href="/resources/plugins/OwlCarousel2-2.2.1/owl.carousel.css">
    <link rel="stylesheet" type="text/css" href="/resources/plugins/OwlCarousel2-2.2.1/owl.theme.default.css">
    <link rel="stylesheet" type="text/css" href="/resources/plugins/OwlCarousel2-2.2.1/animate.css">
    <link rel="stylesheet" type="text/css" href="/resources/plugins/slick-1.8.0/slick.css">
    <link rel="stylesheet" type="text/css" href="/resources/styles/main_styles.css">
    <link rel="stylesheet" type="text/css" href="/resources/styles/responsive.css">

</head>

<body>

<div class="super_container">

    <!-- Header -->

    <header class="header">

        <!-- Top Bar -->

        <div class="top_bar">
            <div class="container">
                <div class="row">
                    <div class="col d-flex flex-row">
                        <div class="top_bar_contact_item"><div class="top_bar_icon"><img src="/resources/images/phone.png" alt=""></div>+7 (495) 229 8520</div>
                        <div class="top_bar_contact_item"><div class="top_bar_icon"><img src="/resources/images/mail.png" alt=""></div><a href="mailto:zapovednik@bk.ru">zapovednik@bk.ru</a></div>
                        <div class="top_bar_content ml-auto">
                            <div class="top_bar_user">
                                <div class="user_icon"><img src="/resources/images/user.svg" alt=""></div>
                                <div><a href="#">Регистрация</a></div>
                                <div><a href="#">Войти</a></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Header Main -->

        <div class="header_main">
            <div class="container">
                <div class="row">

                    <!-- Logo -->
                    <div class="col-lg-2 col-sm-3 col-3 order-1">
                        <div class="logo_container">
                            <div class="logo"><a href="#">AquaOne</a></div>
                        </div>
                    </div>

                    <!-- Search -->
                    <div class="col-lg-6 col-12 order-lg-2 order-3 text-lg-left text-right">
                        <div class="header_search">
                            <div class="header_search_content">
                                <div class="header_search_form_container">
                                    <form action="#" class="header_search_form clearfix">
                                        <input type="search" required="required" class="header_search_input" placeholder="Search for products...">
                                        <div class="custom_dropdown">
                                            <div class="custom_dropdown_list">
                                                <span class="custom_dropdown_placeholder clc">All Categories</span>
                                                <i class="fas fa-chevron-down"></i>
                                                <ul class="custom_list clc">
                                                    <li><a class="clc" href="#">Все Категории</a></li>
                                                    <li><a class="clc" href="#">Вода 19 литров</a></li>
                                                    <li><a class="clc" href="#">Вода 5 литров</a></li>
                                                    <li><a class="clc" href="#">Вода 1.5 литра</a></li>
                                                    <li><a class="clc" href="#">Вода 0.5 литра</a></li>
                                                    <li><a class="clc" href="#">Кулеры</a></li>
                                                    <li><a class="clc" href="#">Посуда</a></li>
                                                </ul>
                                            </div>
                                        </div>
                                        <button type="submit" class="header_search_button trans_300" value="Submit"><img src="/resources/images/search.png" alt=""></button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Wishlist -->
                    <div class="col-lg-4 col-9 order-lg-3 order-2 text-lg-left text-right">
                        <div class="wishlist_cart d-flex flex-row align-items-center justify-content-end">

                            <!-- Cart -->
                            <div class="cart">
                                <div class="cart_container d-flex flex-row align-items-center justify-content-end">
                                    <div class="cart_icon">
                                        <img src="/resources/images/cart.png" alt="">
                                        <div class="cart_count"><span>0</span></div>
                                    </div>
                                    <div class="cart_content">
                                        <div class="cart_text"><a href="#">Корзина</a></div>
                                        <div class="cart_price">0</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Main Navigation -->

        <nav class="main_nav">
            <div class="container">
                <div class="row">
                    <div class="col">

                        <div class="main_nav_content d-flex flex-row">

                            <!-- Categories Menu -->

                            <div class="cat_menu_container">
                                <div class="cat_menu_title d-flex flex-row align-items-center justify-content-start">
                                    <div class="cat_burger"><span></span><span></span><span></span></div>
                                    <div class="cat_menu_text">Каталог товаров</div>
                                </div>

                                <ul class="cat_menu">
                                    <li><a href="#">Вода 19 литров <i class="fas fa-chevron-right ml-auto"></i></a></li>
                                    <li><a href="#">Вода 5 литров<i class="fas fa-chevron-right"></i></a></li>
                                    <li><a href="#">Вода 1.5 литра<i class="fas fa-chevron-right"></i></a></li>
                                    <li><a href="#">Вода 0.5 литра<i class="fas fa-chevron-right"></i></a></li>
                                    <li class="hassubs">
                                        <a href="#">Кулеры<i class="fas fa-chevron-right"></i></a>
                                        <ul>
                                            <li class="hassubs">
                                                <a href="#">AEL<i class="fas fa-chevron-right"></i></a>
                                                <ul>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-right"></i></a></li>
                                        </ul>
                                    </li>
                                    <li><a href="#">Посуда<i class="fas fa-chevron-right"></i></a></li>
                                </ul>
                            </div>

                            <!-- Main Nav Menu -->

                            <div class="main_nav_menu ml-auto">
                                <ul class="standard_dropdown main_nav_dropdown">
                                    <li><a href="#">Главная<i class="fas fa-chevron-down"></i></a></li>
                                    <li class="hassubs">
                                        <a href="#">Доставка<i class="fas fa-chevron-down"></i></a>
                                        <ul>
                                            <li>
                                                <a href="#">Оплата<i class="fas fa-chevron-down"></i></a>
                                                <ul>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                        </ul>
                                    </li>
                                    <li class="hassubs">
                                        <a href="#">Наша продукция<i class="fas fa-chevron-down"></i></a>
                                        <ul>
                                            <li>
                                                <a href="#">Menu Item<i class="fas fa-chevron-down"></i></a>
                                                <ul>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                    <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                                </ul>
                                            </li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="#">Menu Item<i class="fas fa-chevron-down"></i></a></li>
                                        </ul>
                                    </li>
                                    <li class="hassubs">
                                        <a href="#">Страницы<i class="fas fa-chevron-down"></i></a>
                                        <ul>
                                            <li><a href="shop.html">Магазин<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="product.html">Продукция<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="blog.html">Блог<i class="fas fa-chevron-down"></i></a></li>
                                            <!--<li><a href="blog_single.html">Blog Post<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="regular.html">Regular Post<i class="fas fa-chevron-down"></i></a></li>-->
                                            <li><a href="cart.html">Корзина<i class="fas fa-chevron-down"></i></a></li>
                                            <li><a href="contact.html">Контакты<i class="fas fa-chevron-down"></i></a></li>
                                        </ul>
                                    </li>
                                    <li><a href="blog.html">Блог<i class="fas fa-chevron-down"></i></a></li>
                                    <li><a href="contact.html">Контакты<i class="fas fa-chevron-down"></i></a></li>
                                </ul>
                            </div>

                            <!-- Menu Trigger -->

                            <div class="menu_trigger_container ml-auto">
                                <div class="menu_trigger d-flex flex-row align-items-center justify-content-end">
                                    <div class="menu_burger">
                                        <div class="menu_trigger_text">menu</div>
                                        <div class="cat_burger menu_burger_inner"><span></span><span></span><span></span></div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </nav>

        <!-- Menu -->

    </header>

    <!-- Banner -->

    <div class="banner">
        <div class="banner_background" style="background-image:url(/resources/images/banner_background.jpg)"></div>
        <div class="container fill_height">
            <div class="row fill_height">
                <div class="banner_product_image"><img src="/resources/images/aqua%C2%A0—%20копия.png" alt=""></div>
                <div class="col-lg-5 offset-lg-4 fill_height">
                    <div class="banner_content">
                        <h1 class="banner_text">Новая эра питьевой воды</h1>
                        <div class="banner_price"><span>450руб</span>300руб</div>
                        <div class="banner_product_name">Вода Кашинская</div>
                        <div class="button banner_button"><a href="#">Купи сейчас</a></div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Characteristics -->

    <!-- Deals of the week -->

    <div class="deals_featured">
        <div class="container">
            <div class="row">
                <div class="col d-flex flex-lg-row flex-column align-items-center justify-content-start">

                    <!-- Deals -->

                    <!-- Featured -->
                    <div class="featured">
                        <div class="tabbed_container">
                            <div class="tabs">
                                <ul class="clearfix">
                                    <li class="active">Продукция</li>
                                    <!--<li>On Sale</li>
                                    <li>Best Rated</li>-->
                                </ul>
                                <div class="tabs_line">
                                    <span style="left: 0px; width: 99.8906px;"></span>
                               </div>
                            </div>

                            <!-- Product Panel -->

                            <%--<div class="product_panel panel active">
                                <div class="featured_slider slider">

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/bottle19.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price discount">350руб<span>400руб</span></div>
                                                <div class="product_name"><div><a href="product.html">Вода 19 литров</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount">-25%</li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item is_new d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/bottle05.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">50руб</div>
                                                <div class="product_name"><div><a href="product.html">Вода 0.5 литра</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button active">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/bottle05.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">150руб</div>
                                                <div class="product_name"><div><a href="product.html">Вода 1.5 литра без газа</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/bottle05.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price discount">100руб<span>150руб</span></div>
                                                <div class="product_name"><div><a href="product.html">Вода 1.5 литра с газом</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount">-25%</li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/bottle19.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">180руб</div>
                                                <div class="product_name"><div><a href="/resources/product.html">Вода 5 литров</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_6.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">6000руб</div>
                                                <div class="product_name"><div><a href="product.html">Кулер</a></div></div>
                                                <div class="product_extras">
                                                    <button class="product_cart_button">Купить</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item is_new d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_7.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$379</div>
                                                <div class="product_name"><div><a href="product.html">Lenovo IdeaPad</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount">-25%</li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_8.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$225</div>
                                                <div class="product_name"><div><a href="product.html">Digitus EDNET...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_1.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$225</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_2.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$379</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_3.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$379</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_4.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$225</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_5.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$225</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_6.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$379</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_7.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$379</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                    <!-- Slider Item -->
                                    <div class="featured_slider_item">
                                        <div class="border_active"></div>
                                        <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                            <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="/resources/images/featured_8.png" alt=""></div>
                                            <div class="product_content">
                                                <div class="product_price">$225</div>
                                                <div class="product_name"><div><a href="product.html">Huawei MediaPad...</a></div></div>
                                                <div class="product_extras">
                                                    <div class="product_color">
                                                        <input type="radio" checked name="product_color" style="background:#b19c83">
                                                        <input type="radio" name="product_color" style="background:#000000">
                                                        <input type="radio" name="product_color" style="background:#999999">
                                                    </div>
                                                    <button class="product_cart_button">Add to Cart</button>
                                                </div>
                                            </div>
                                            <div class="product_fav"><i class="fas fa-heart"></i></div>
                                            <ul class="product_marks">
                                                <li class="product_mark product_discount"></li>
                                                <li class="product_mark product_new">new</li>
                                            </ul>
                                        </div>
                                    </div>

                                </div>
                                <div class="featured_slider_dots_cover"></div>
                            </div>--%>

                            <div class="product_panel panel active">
                                <div class="featured_slider slider slick-initialized slick-slider slick-dotted"><div class="slick-list draggable"><div class="slick-track" style="opacity: 1; width: 1576px; transform: translate3d(0px, 0px, 0px);"><div class="slick-slide slick-current slick-active" data-slick-index="0" aria-hidden="false" tabindex="0" role="tabpanel" id="slick-slide00" aria-describedby="slick-slide-control00" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active active"></div>
                                    <div class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/bottle19.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price discount">350руб<span>400руб</span></div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Вода 19 литров</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount">-25%</li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active active"></div>
                                    <div class="product_item is_new d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/bottle05.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">50руб</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Вода 0.5 литра</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button active" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide slick-active" data-slick-index="1" aria-hidden="false" tabindex="0" role="tabpanel" id="slick-slide01" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/bottle05.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">150руб</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Вода 1.5 литра без газа</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active active"></div>
                                    <div class="product_item discount d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/bottle05.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price discount">100руб<span>150руб</span></div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Вода 1.5 литра с газом</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount">-25%</li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide slick-active" data-slick-index="2" aria-hidden="false" tabindex="0" role="tabpanel" id="slick-slide02" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/bottle19.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">180руб</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Вода 5 литров</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_6.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">6000руб</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="0">Кулер</a></div></div>
                                            <div class="product_extras">
                                                <!--<div class="product_color">
                                                    <input type="radio" checked name="product_color" style="background:#b19c83">
                                                    <input type="radio" name="product_color" style="background:#000000">
                                                    <input type="radio" name="product_color" style="background:#999999">
                                                </div>-->
                                                <button class="product_cart_button" tabindex="0">Купить</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide" data-slick-index="3" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide03" aria-describedby="slick-slide-control01" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item is_new d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_7.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$379</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Lenovo IdeaPad</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount">-25%</li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_8.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$225</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Digitus EDNET...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide" data-slick-index="4" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide04" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_1.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$225</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_2.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$379</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide" data-slick-index="5" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide05" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_3.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$379</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_4.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$225</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide" data-slick-index="6" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide06" aria-describedby="slick-slide-control02" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_5.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$225</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_6.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$379</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div><div class="slick-slide" data-slick-index="7" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide07" style="width: 197px;"><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_7.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$379</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div><div><div class="featured_slider_item" style="width: 100%; display: inline-block;">
                                    <div class="border_active"></div>
                                    <div class="product_item d-flex flex-column align-items-center justify-content-center text-center">
                                        <div class="product_image d-flex flex-column align-items-center justify-content-center"><img src="images/featured_8.png" alt=""></div>
                                        <div class="product_content">
                                            <div class="product_price">$225</div>
                                            <div class="product_name"><div><a href="product.html" tabindex="-1">Huawei MediaPad...</a></div></div>
                                            <div class="product_extras">
                                                <div class="product_color">
                                                    <input type="radio" checked="" name="product_color" style="background:#b19c83" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#000000" tabindex="-1">
                                                    <input type="radio" name="product_color" style="background:#999999" tabindex="-1">
                                                </div>
                                                <button class="product_cart_button" tabindex="-1">Add to Cart</button>
                                            </div>
                                        </div>
                                        <div class="product_fav"><i class="fas fa-heart"></i></div>
                                        <ul class="product_marks">
                                            <li class="product_mark product_discount"></li>
                                            <li class="product_mark product_new">new</li>
                                        </ul>
                                    </div>
                                </div></div></div></div></div><ul class="slick-dots" style="" role="tablist"><li class="slick-active" role="presentation"><button type="button" role="tab" id="slick-slide-control00" aria-controls="slick-slide00" aria-label="1 of 3" tabindex="0" aria-selected="true">1</button></li><li role="presentation"><button type="button" role="tab" id="slick-slide-control01" aria-controls="slick-slide03" aria-label="2 of 3" tabindex="-1">2</button></li><li role="presentation"><button type="button" role="tab" id="slick-slide-control02" aria-controls="slick-slide06" aria-label="3 of 3" tabindex="-1">3</button></li></ul></div>
                                <div class="featured_slider_dots_cover"></div>
                            </div>

                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <!-- Popular Categories -->

    <div class="popular_categories">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="popular_categories_content">
                        <div class="popular_categories_title">Популярные Категории</div>
                        <div class="popular_categories_slider_nav">
                            <div class="popular_categories_prev popular_categories_nav"><i class="fas fa-angle-left ml-auto"></i></div>
                            <div class="popular_categories_next popular_categories_nav"><i class="fas fa-angle-right ml-auto"></i></div>
                        </div>
                        <div class="popular_categories_link"><a href="#">полный каталог</a></div>
                    </div>
                </div>

                <!-- Popular Categories Slider -->

                <div class="col-lg-9">
                    <div class="popular_categories_slider_container">
                        <div class="owl-carousel owl-theme popular_categories_slider">

                            <!-- Popular Categories Item -->
                            <div class="owl-item">
                                <div class="popular_category d-flex flex-column align-items-center justify-content-center">
                                    <div class="popular_category_image"><img src="/resources/images/popular_1.png" alt=""></div>
                                    <div class="popular_category_text">Питьевая вода</div>
                                </div>
                            </div>

                            <!-- Popular Categories Item -->
                            <div class="owl-item">
                                <div class="popular_category d-flex flex-column align-items-center justify-content-center">
                                    <div class="popular_category_image"><img src="/resources/images/popular_2.png" alt=""></div>
                                    <div class="popular_category_text">Кулеры</div>
                                </div>
                            </div>

                            <!-- Popular Categories Item -->
                            <div class="owl-item">
                                <div class="popular_category d-flex flex-column align-items-center justify-content-center">
                                    <div class="popular_category_image"><img src="/resources/images/popular_3.png" alt=""></div>
                                    <div class="popular_category_text">Аксесуары</div>
                                </div>
                            </div>

                            <!-- Popular Categories Item -->
                            <div class="owl-item">
                                <div class="popular_category d-flex flex-column align-items-center justify-content-center">
                                    <div class="popular_category_image"><img src="/resources/images/popular_4.png" alt=""></div>
                                    <div class="popular_category_text">Посуда</div>
                                </div>
                            </div>

                            <!-- Popular Categories Item -->
                            <div class="owl-item">
                                <div class="popular_category d-flex flex-column align-items-center justify-content-center">
                                    <div class="popular_category_image"><img src="/resources/images/popular_5.png" alt=""></div>
                                    <div class="popular_category_text">Что-то еще</div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Newsletter -->

    <div class="newsletter">
        <div class="container">
            <div class="row">
                <div class="col">
                    <div class="newsletter_container d-flex flex-lg-row flex-column align-items-lg-center align-items-center justify-content-lg-start justify-content-center">
                        <div class="newsletter_title_container">
                            <div class="newsletter_icon"><img src="/resources/images/send.png" alt=""></div>
                            <div class="newsletter_title">Подпишись на рассылку новостей</div>
                            <div class="newsletter_text"><p>...и получи скидку 10% на первую покупку</p></div>
                        </div>
                        <div class="newsletter_content clearfix">
                            <form action="#" class="newsletter_form">
                                <input type="email" class="newsletter_input" required="required" placeholder="Enter your email address">
                                <button class="newsletter_button">Подписаться</button>
                            </form>
                            <div class="newsletter_unsubscribe_link"><a href="#">отписаться</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Footer -->

    <footer class="footer">
        <div class="container">
            <div class="row">

                <div class="col-lg-3 footer_col">
                    <div class="footer_column footer_contact">
                        <div class="logo_container">
                            <div class="logo"><a href="#">AquaOne</a></div>
                        </div>
                        <div class="footer_title">Есть вопрос? Позвони нам 24/7</div>
                        <div class="footer_phone">+7 (495) 229 8520</div>
                        <div class="footer_contact_text">
                            <p>12 ул.Строителей, Москва</p>
                            <p>Grester London NW18JR, UK</p>
                        </div>
                        <div class="footer_social">
                            <ul>
                                <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fab fa-youtube"></i></a></li>
                                <li><a href="#"><i class="fab fa-google"></i></a></li>
                                <li><a href="#"><i class="fab fa-vimeo-v"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <div class="col-lg-2 offset-lg-2">
                    <div class="footer_column">
                        <div class="footer_title">Найди быстро</div>
                        <ul class="footer_list">
                            <li><a href="#">Питьевая вода</a></li>
                            <li><a href="#">Кулеры</a></li>
                            <li><a href="#">Аксесуары</a></li>
                            <li><a href="#">Посуда</a></li>
                            <!--<li><a href="#">TV & Audio</a></li>-->
                        </ul>
                        <!--<div class="footer_subtitle">Gadgets</div>
                        <ul class="footer_list">
                            <li><a href="#">Car Electronics</a></li>
                        </ul>-->
                    </div>
                </div>

                <!--<div class="col-lg-2">
                    <div class="footer_column">
                        <ul class="footer_list footer_list_2">
                            <li><a href="#">Video Games & Consoles</a></li>
                            <li><a href="#">Accessories</a></li>
                            <li><a href="#">Cameras & Photos</a></li>
                            <li><a href="#">Hardware</a></li>
                            <li><a href="#">Computers & Laptops</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-lg-2">
                    <div class="footer_column">
                        <div class="footer_title">Customer Care</div>
                        <ul class="footer_list">
                            <li><a href="#">My Account</a></li>
                            <li><a href="#">Order Tracking</a></li>
                            <li><a href="#">Wish List</a></li>
                            <li><a href="#">Customer Services</a></li>
                            <li><a href="#">Returns / Exchange</a></li>
                            <li><a href="#">FAQs</a></li>
                            <li><a href="#">Product Support</a></li>
                        </ul>
                    </div>
                </div>-->

            </div>
        </div>
    </footer>

    <!-- Copyright -->

    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col">

                    <div class="copyright_container d-flex flex-sm-row flex-column align-items-center justify-content-start">
                        <div class="copyright_content"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        </div>
                        <div class="logos ml-sm-auto">
                            <ul class="logos_list">
                                <li><a href="#"><img src="/resources/images/logos_1.png" alt=""></a></li>
                                <li><a href="#"><img src="/resources/images/logos_2.png" alt=""></a></li>
                                <li><a href="#"><img src="/resources/images/logos_3.png" alt=""></a></li>
                                <li><a href="#"><img src="/resources/images/logos_4.png" alt=""></a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/resources/js/jquery-3.3.1.min.js"></script>
<script src="/resources/styles/bootstrap4/popper.js"></script>
<script src="/resources/styles/bootstrap4/bootstrap.min.js"></script>
<script src="/resources/plugins/greensock/TweenMax.min.js"></script>
<script src="/resources/plugins/greensock/TimelineMax.min.js"></script>
<script src="/resources/plugins/scrollmagic/ScrollMagic.min.js"></script>
<script src="/resources/plugins/greensock/animation.gsap.min.js"></script>
<script src="/resources/plugins/greensock/ScrollToPlugin.min.js"></script>
<script src="/resources/plugins/OwlCarousel2-2.2.1/owl.carousel.js"></script>
<script src="/resources/plugins/slick-1.8.0/slick.js"></script>
<script src="/resources/plugins/easing/easing.js"></script>
<script src="/resources/js/custom.js"></script>
</body>

</html>