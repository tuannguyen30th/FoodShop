package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Items;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_set_var_value_nobody.release();
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_forEach_end_begin.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Food website</title>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Karla\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/topdishes.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/filterPrice.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/alert.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/hienlen.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/starrating.css\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Pangolin&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Pangolin&family=Roboto+Mono:wght@300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Pangolin&family=Roboto+Mono:wght@300&family=Ysabeau:wght@1;300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Pangolin&family=Roboto+Mono:wght@300&family=Secular+One&family=Ysabeau:wght@1;300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Alfa+Slab+One&family=Pangolin&family=Roboto+Mono:wght@300&family=Secular+One&family=Ysabeau:wght@1;300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("         function setCheck1(obj){\r\n");
      out.write("             var fries = document.getElementsByName('price');\r\n");
      out.write("             if((obj.id==='g0') && (fries[0].checked===true)){\r\n");
      out.write("                 for(var i = 1; i < fries.length; i++){\r\n");
      out.write("                     fries[i].checked=false;\r\n");
      out.write("                 }\r\n");
      out.write("             }\r\n");
      out.write("             else{\r\n");
      out.write("                 for(var i = 1; i < fries.length; i++){\r\n");
      out.write("                     if(fries[i].checked===true){\r\n");
      out.write("                         fries[0].checked=false;\r\n");
      out.write("                         break;\r\n");
      out.write("                     }\r\n");
      out.write("                 }\r\n");
      out.write("             }\r\n");
      out.write("             document.getElementById('f2').submit();\r\n");
      out.write("         }\r\n");
      out.write("     </script>\r\n");
      out.write("     <style>\r\n");
      out.write("      .het-hang {\r\n");
      out.write("    position: fixed;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    z-index: 9999;\r\n");
      out.write("    background-color: #f8d7da;\r\n");
      out.write("    color: #721c24;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    border: 1px solid #f5c6cb;\r\n");
      out.write("}\r\n");
      out.write("    \r\n");
      out.write("     </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("    <!--Desktop view-->\r\n");
      out.write("    <div id=\"container\" class=\"container\">\r\n");
      out.write("        <div id=\"cart\">\r\n");
      out.write("            <div class=\"icon\">\r\n");
      out.write("                <img src=\"images/Artboard 1.png\" alt=\"list\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"category-list\">\r\n");
      out.write("                <div class=\"kindDish\">\r\n");
      out.write("                    <p class=\"item-menu\">Kinds Of Dishes</p>\r\n");
      out.write("                    <div class=\"border\"></div>\r\n");
      out.write("                    <div class=\"list-card\">\r\n");
      out.write("                        <a id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${0}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" href=\"list?action=filter&cid=0\" class=\"list-name\">The whole dish</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                   \r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("                 <div class=\"filter-price\">\r\n");
      out.write("                    <p class=\"title-price\">Price</p>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                     ");
      if (_jspx_meth_c_set_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <form id=\"f2\" action=\"home1\">\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"checkbox\" name=\"price\" id=\"g0\"\r\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pb[0]?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                            value=\"0\" onclick=\"setCheck1(this)\"\r\n");
      out.write("                                   > ALL\r\n");
      out.write("                        </div>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                    </form>                 \r\n");
      out.write("                </div>\r\n");
      out.write("          \r\n");
      out.write("                 \r\n");
      out.write("            </div>\r\n");
      out.write("       \r\n");
      out.write("         </div>\r\n");
      out.write("        <div id=\"food-container\">\r\n");
      out.write("           <div id=\"header\">\r\n");
      out.write("                <div class=\"util\">\r\n");
      out.write("                    <form class=\"search-item\" action=\"search\">\r\n");
      out.write("                            <input type=\"text\" placeholder=\"Search\" name=\"search\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.search}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("                            <button type=\"submit\" class=\"button-search\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    ");
      if (_jspx_meth_c_set_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <div class=\"home\">\r\n");
      out.write("                        <i class=\"fa fa-home\"><a href=\"list\"> Home</a></i>\r\n");
      out.write("                        <i class=\"fa fa-cart-plus\" id=\"cart-plus\"><a href=\"cartItem.jsp\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" Items</a></i>\r\n");
      out.write("                    </div>                                        \r\n");
      out.write("                 \r\n");
      out.write("                    <div class=\"taste-header\">               \r\n");
      out.write("                        \r\n");
      out.write("                            \r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("       \r\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        <!--<a href=\"\">Hello TTP</a>-->\r\n");
      out.write("                         \r\n");
      out.write("                            \r\n");
      out.write("                       \r\n");
      out.write("                   </div>\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"menu-background\">\r\n");
      out.write("                <div class=\"slideshow-container\">\r\n");
      out.write("                    <img src=\"images/menu-desktop-top-2x-1-w2732h822.jpg\" alt=\"\" class=\"slide active\" >\r\n");
      out.write("                    <img src=\"images/banner2.jpg\" alt=\"\" class=\"slide\">\r\n");
      out.write("                    <img src=\"images/banner3.jpg\" alt=\"\" class=\"slide\">\r\n");
      out.write("                    <img src=\"images/banner4.jpg\" alt=\"\" class=\"slide\">\r\n");
      out.write("                    <img src=\"images/banner5.jpg\" alt=\"\" class=\"slide\">\r\n");
      out.write("                  </div>\r\n");
      out.write("                 \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header\">Top dishes</div>\r\n");
      out.write("               \r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("  \r\n");
      out.write("               \r\n");
      out.write("            </div>  \r\n");
      out.write("            <div class=\"list-product\">\r\n");
      out.write("                <p>-----------List Dishes-----------</p>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("                 ");
 if (request.getAttribute("hetHang") != null && (int) request.getAttribute("hetHang") == 0) { 
      out.write("\r\n");
      out.write("                    <div class=\"alert-het-hang\">\r\n");
      out.write("                        <div class=\"message\">Out of stock <i class=\"fa fa-times\"></i></div>\r\n");
      out.write("                        <span class=\"close-btn\">&times;</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                ");
 if (request.getAttribute("success") != null && (int) request.getAttribute("success") == 1) { 
      out.write("\r\n");
      out.write("                    <div class=\"alert-het-hang\">\r\n");
      out.write("                        <div class=\"message\">Successfully <i class=\"fa fa-check\"></i></div>\r\n");
      out.write("                        <span class=\"close-btn\">&times;</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            <div id=\"food-items\" >\r\n");
      out.write("                 <!--<div id=\"biryani\">-->\r\n");
      out.write("                  ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("   \r\n");
      out.write("                \r\n");
      out.write("              <!--</div>--> \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                            ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("     \r\n");
      out.write("                <div class=\"paging-container\">\r\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("               \r\n");
      out.write("                \r\n");
      out.write("              \r\n");
      out.write("            <div class=\"footer\">      \r\n");
      out.write("                <div class=\"row-footer\">\r\n");
      out.write("                    <div class=\"footer-col\">\r\n");
      out.write("                        <h4>Company</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"anoutus.jsp\">About Us</a></li>\r\n");
      out.write("                         \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer-col\">\r\n");
      out.write("                        <h4>Get help</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"\">Contact with us</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer-col\">\r\n");
      out.write("                        <h4>Online shop</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"#\">Chicken</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Pizza</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Vegetarian</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Noodles</a></li>\r\n");
      out.write("                            <li><a href=\"#\">Drinking</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"footer-col\">\r\n");
      out.write("                        <h4>Follow us</h4>\r\n");
      out.write("                        <div class=\"social-links\">\r\n");
      out.write("                            <a href=\"https://www.facebook.com/profile.php?id=100037391781696\"><i class=\"fa fa-facebook-f\"></i></a>\r\n");
      out.write("                            <a href=\"https://www.instagram.com/nguyenngoctuan230/\"><i class=\"fa fa-instagram\"></i></a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>         \r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(document).ready(function() {\r\n");
      out.write("                    $(\".close-btn\").click(function() {\r\n");
      out.write("                        $(\".alert-het-hang\").hide();\r\n");
      out.write("                    });\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("       <script>\r\n");
      out.write("      document.getElementById('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').style.color = \"white\";  \r\n");
      out.write("     </script>\r\n");
      out.write("    <script>\r\n");
      out.write("      document.getElementById('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${index}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').style.color = \"white\";  \r\n");
      out.write("     </script>\r\n");
      out.write("      <script>\r\n");
      out.write("      document.getElementById('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("').style.color = \"orange\";  \r\n");
      out.write("     \r\n");
      out.write("     </script>\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"\" type=\"module\"></script>\r\n");
      out.write("    <script src=\"alert.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("        var slides = document.querySelectorAll(\".slide\");\r\n");
      out.write("        var currentIndex = 0;\r\n");
      out.write("      \r\n");
      out.write("        function changeSlide() {\r\n");
      out.write("          slides[currentIndex].classList.remove(\"active\");\r\n");
      out.write("          slides[currentIndex].classList.add(\"next\");\r\n");
      out.write("          currentIndex = (currentIndex + 1) % slides.length;\r\n");
      out.write("          slides[currentIndex].classList.add(\"active\");\r\n");
      out.write("          slides[currentIndex].classList.remove(\"next\");\r\n");
      out.write("        }\r\n");
      out.write("      \r\n");
      out.write("        setInterval(changeSlide, 3000); // Change slide every 3 seconds\r\n");
      out.write("      </script>\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                        <div class=\"list-card\">\r\n");
          out.write("                            <a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" href=\"ListCatogoriesServlet?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"list-name ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cid == i.id ? \"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                         </div>   \r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("pb");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pb}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_set_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_1.setPageContext(_jspx_page_context);
    _jspx_th_c_set_1.setParent(null);
    _jspx_th_c_set_1.setVar("pp");
    _jspx_th_c_set_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.pp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_1 = _jspx_th_c_set_1.doStartTag();
    if (_jspx_th_c_set_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${2}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                 <div><input type=\"checkbox\" name=\"price\" id=\"g1\"                                                           \r\n");
          out.write("                                  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pb[i+1]?\"checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                   value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(i+1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\r\n");
          out.write("                                  onclick=\"setCheck1(this)\"\r\n");
          out.write("                                             >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pp[i]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>                            \r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_set_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_2.setPageContext(_jspx_page_context);
    _jspx_th_c_set_2.setParent(null);
    _jspx_th_c_set_2.setVar("size");
    _jspx_th_c_set_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.size}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_2 = _jspx_th_c_set_2.doStartTag();
    if (_jspx_th_c_set_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_2);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                \r\n");
        out.write("                                    \r\n");
        out.write("                                    <div class=\"header__navbar-item\">\r\n");
        out.write("                                    <p class=\"hello\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</p>\r\n");
        out.write("                                    \r\n");
        out.write("                                    <ul class=\"header__navbar-user-menu\">\r\n");
        out.write("                                        <li class=\"header__navber-user-item\">\r\n");
        out.write("                                            <a href=\"infor\">Account</a>              \r\n");
        out.write("                                        </li>\r\n");
        out.write("                                        <li class=\"header__navber-user-item\">\r\n");
        out.write("                                            <a href=\"statuscontroller\">My purchase order</a>              \r\n");
        out.write("                                        </li>\r\n");
        out.write("                                         \r\n");
        out.write("                                            <li class=\"header__navber-user-item\">                                      \r\n");
        out.write("                                            <a href=\"logout\">Logout</a>\r\n");
        out.write("                                             </li>\r\n");
        out.write("                                    </ul>\r\n");
        out.write("                                 </div>\r\n");
        out.write("                               <div>\r\n");
        out.write("                                \r\n");
        out.write("                               </div>\r\n");
        out.write("                                \r\n");
        out.write("                                 \r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                 <i class=\"fa fa-user-circle\">\r\n");
        out.write("                                    <a href=\"login.jsp\">Login</a>\r\n");
        out.write("                                </i>\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listtop4}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("top4");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" \r\n");
          out.write("                <div id=\"item-card1\">                       \r\n");
          out.write("                    <a href=\"detailproduct?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.itemID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">  <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.imagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"> </a>\r\n");
          out.write("                    <p id=\"item-name1\"><a href=\"detailproduct?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.itemID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                    <div class=\"price-quantity1\">\r\n");
          out.write("                        <p id=\"item-price1\">Price : $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                        <div class=\"line1\"></div>\r\n");
          out.write("                        <p id=\"item-quantity1\">Quantity sold: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.totalquantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                       ");
          if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("                      ");
          if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("     \r\n");
          out.write("                        <a class=\"addToCard1\" href=\"buy?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.itemID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&action=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&num=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to cart</a>  \r\n");
          out.write("                   \r\n");
          out.write("                </div>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_forEach_3.setBegin(1);
    _jspx_th_c_forEach_3.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${top4.star}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div class=\"hinh_ngoi_sao \" style=\"display:inline-block; \"></div>");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        out.write("\r\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'search'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_set_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_3.setPageContext(_jspx_page_context);
    _jspx_th_c_set_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_set_3.setVar("o");
    _jspx_th_c_set_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&search=${requestScope.searcht}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_3.setScope("request");
    int _jspx_eval_c_set_3 = _jspx_th_c_set_3.doStartTag();
    if (_jspx_th_c_set_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_3);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'filter'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_set_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_4.setPageContext(_jspx_page_context);
    _jspx_th_c_set_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_set_4.setVar("o");
    _jspx_th_c_set_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&cid=${requestScope.cid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_4.setScope("request");
    int _jspx_eval_c_set_4 = _jspx_th_c_set_4.doStartTag();
    if (_jspx_th_c_set_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_4);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'checkbox'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_set_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_5.setPageContext(_jspx_page_context);
    _jspx_th_c_set_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_set_5.setVar("o");
    _jspx_th_c_set_5.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&price=${requestScope.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_5.setScope("request");
    int _jspx_eval_c_set_5 = _jspx_th_c_set_5.doStartTag();
    if (_jspx_th_c_set_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_5);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("i");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                      \r\n");
          out.write("                          <input type=\"hidden\" name=\"sid\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                    <div id=\"item-card\">\r\n");
          out.write("                        <form action=\"detailproduct\" method=\"post\">\r\n");
          out.write("                        <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.imagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" href=\"detailproduct?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                        <p id=\"item-name\"><a href=\"detailproduct?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\r\n");
          out.write("                        <p id=\"item-price\">Price : ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                         ");
          if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("     \r\n");
          out.write("                        <a class=\"addToCard\" href=\"buy?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&action=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&num=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${num}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to cart</a>  \r\n");
          out.write("                        </form>\r\n");
          out.write("                    </div>\r\n");
          out.write("                    \r\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        out.write("\r\n");
        out.write("                          ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'search'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_set_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_6.setPageContext(_jspx_page_context);
    _jspx_th_c_set_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_set_6.setVar("o");
    _jspx_th_c_set_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&search=${requestScope.searcht}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_6.setScope("request");
    int _jspx_eval_c_set_6 = _jspx_th_c_set_6.doStartTag();
    if (_jspx_th_c_set_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_6);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_6);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'filter'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_set_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_7.setPageContext(_jspx_page_context);
    _jspx_th_c_set_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_4);
    _jspx_th_c_set_7.setVar("o");
    _jspx_th_c_set_7.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&cid=${requestScope.cid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_7.setScope("request");
    int _jspx_eval_c_set_7 = _jspx_th_c_set_7.doStartTag();
    if (_jspx_th_c_set_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_7);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_7);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'checkbox'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_set_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_8.setPageContext(_jspx_page_context);
    _jspx_th_c_set_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_set_8.setVar("o");
    _jspx_th_c_set_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&price=${requestScope.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_8.setScope("request");
    int _jspx_eval_c_set_8 = _jspx_th_c_set_8.doStartTag();
    if (_jspx_th_c_set_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_8);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_8);
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'search'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_set_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_9 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_9.setPageContext(_jspx_page_context);
    _jspx_th_c_set_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_set_9.setVar("o");
    _jspx_th_c_set_9.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&search=${requestScope.searcht}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_9.setScope("request");
    int _jspx_eval_c_set_9 = _jspx_th_c_set_9.doStartTag();
    if (_jspx_th_c_set_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_9);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_9);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'filter'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_set_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_10 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_10.setPageContext(_jspx_page_context);
    _jspx_th_c_set_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    _jspx_th_c_set_10.setVar("o");
    _jspx_th_c_set_10.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&cid=${requestScope.cid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_10.setScope("request");
    int _jspx_eval_c_set_10 = _jspx_th_c_set_10.doStartTag();
    if (_jspx_th_c_set_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_10);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_10);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action eq 'checkbox'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_c_set_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_8, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_set_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_11 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_11.setPageContext(_jspx_page_context);
    _jspx_th_c_set_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_c_set_11.setVar("o");
    _jspx_th_c_set_11.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("&price=${requestScope.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_set_11.setScope("request");
    int _jspx_eval_c_set_11 = _jspx_th_c_set_11.doStartTag();
    if (_jspx_th_c_set_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_11);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_11);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setBegin(1);
    _jspx_th_c_forEach_5.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_5.setVar("e");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"paging\">\r\n");
          out.write("                                <a id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"num-paging\" href=\"list?num=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&action=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.action}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${e}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("                             </div>\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }
}
