/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.43
 * Generated at: 2017-08-28 07:26:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(12);
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/jakarta-taglibs-standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/struts-1.2.9.jar!/META-INF/tlds/struts-html.tld", Long.valueOf(1141885850000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta-taglibs-standard-1.1.2.jar", Long.valueOf(1502185943000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/sa-struts-1.0.4-sp9.jar!/META-INF/f.tld", Long.valueOf(1313227424000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/struts-1.2.9.jar!/META-INF/tlds/struts-tiles-1.1.tld", Long.valueOf(1141885850000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/jakarta-taglibs-standard-1.1.2.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/struts-1.2.9.jar", Long.valueOf(1502185943000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/sa-struts-1.0.4-sp9.jar!/META-INF/s.tld", Long.valueOf(1313227424000L));
    _jspx_dependants.put("/WEB-INF/lib/sa-struts-1.0.4-sp9.jar", Long.valueOf(1502185943000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/struts-1.2.9.jar!/META-INF/tlds/struts-bean.tld", Long.valueOf(1141885850000L));
    _jspx_dependants.put("/WEB-INF/view/common/common.jsp", Long.valueOf(1502185942000L));
    _jspx_dependants.put("jar:file:/Applications/Eclipse_4.6.3.app/Contents/workspace/Practice6/src/main/webapp/WEB-INF/lib/jakarta-taglibs-standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fproperty_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("<title>Dolteng Auto Generated</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<h2>生年月日を入力してね！（例：1995-03-25）</h2>\r\n");
      out.write("\r\n");
      if (_jspx_meth_s_005fform_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_005fform_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.seasar.struts.taglib.S2FormTag _jspx_th_s_005fform_005f0 = (org.seasar.struts.taglib.S2FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.get(org.seasar.struts.taglib.S2FormTag.class);
    boolean _jspx_th_s_005fform_005f0_reused = false;
    try {
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /WEB-INF/view/index.jsp(10,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("/omikuji");
      // /WEB-INF/view/index.jsp(10,0) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setMethod("post");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005ftext_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_html_005ferrors_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          if (_jspx_meth_s_005fsubmit_005f0(_jspx_th_s_005fform_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fmethod_005faction.reuse(_jspx_th_s_005fform_005f0);
      _jspx_th_s_005fform_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fform_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fform_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ftext_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:text
    org.apache.struts.taglib.html.TextTag _jspx_th_html_005ftext_005f0 = (org.apache.struts.taglib.html.TextTag) _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.TextTag.class);
    boolean _jspx_th_html_005ftext_005f0_reused = false;
    try {
      _jspx_th_html_005ftext_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ftext_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/view/index.jsp(11,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ftext_005f0.setProperty("birthDay");
      int _jspx_eval_html_005ftext_005f0 = _jspx_th_html_005ftext_005f0.doStartTag();
      if (_jspx_th_html_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ftext_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ftext_005f0);
      _jspx_th_html_005ftext_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ftext_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ftext_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_html_005ferrors_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  html:errors
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_005ferrors_005f0 = (org.apache.struts.taglib.html.ErrorsTag) _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    boolean _jspx_th_html_005ferrors_005f0_reused = false;
    try {
      _jspx_th_html_005ferrors_005f0.setPageContext(_jspx_page_context);
      _jspx_th_html_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/view/index.jsp(12,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_html_005ferrors_005f0.setProperty("birthDay");
      int _jspx_eval_html_005ferrors_005f0 = _jspx_th_html_005ferrors_005f0.doStartTag();
      if (_jspx_th_html_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fhtml_005ferrors_0026_005fproperty_005fnobody.reuse(_jspx_th_html_005ferrors_005f0);
      _jspx_th_html_005ferrors_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_html_005ferrors_005f0, _jsp_getInstanceManager(), _jspx_th_html_005ferrors_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_s_005fsubmit_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fform_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.seasar.struts.taglib.S2SubmitTag _jspx_th_s_005fsubmit_005f0 = (org.seasar.struts.taglib.S2SubmitTag) _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fproperty_005fnobody.get(org.seasar.struts.taglib.S2SubmitTag.class);
    boolean _jspx_th_s_005fsubmit_005f0_reused = false;
    try {
      _jspx_th_s_005fsubmit_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fsubmit_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fform_005f0);
      // /WEB-INF/view/index.jsp(13,0) name = property type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setProperty("result");
      // /WEB-INF/view/index.jsp(13,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fsubmit_005f0.setValue("占う");
      int _jspx_eval_s_005fsubmit_005f0 = _jspx_th_s_005fsubmit_005f0.doStartTag();
      if (_jspx_th_s_005fsubmit_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fs_005fsubmit_0026_005fvalue_005fproperty_005fnobody.reuse(_jspx_th_s_005fsubmit_005f0);
      _jspx_th_s_005fsubmit_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_s_005fsubmit_005f0, _jsp_getInstanceManager(), _jspx_th_s_005fsubmit_005f0_reused);
    }
    return false;
  }
}
