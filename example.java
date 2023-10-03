public class TestLog4 {
  private final static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  @Override
  public void doFilter(ServletRequest request, ServletResponse response,
    FilterChain chain) throws IOException, ServletException {
      HttpServletRequest httpServletReq = (HttpServletRequest) request;
      String param = httpServletReq.getParameter("param");
      // ruleid: crlf-injection-logs-deepsemgrep
      log.log(log.getLevel(), param);
  }
}
