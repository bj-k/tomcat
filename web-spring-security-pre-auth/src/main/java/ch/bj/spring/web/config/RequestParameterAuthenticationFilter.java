package ch.bj.spring.web.config;
import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

/**
 * Takes the principal from parameter 'u'.
 */
public class RequestParameterAuthenticationFilter extends AbstractPreAuthenticatedProcessingFilter {
	private String userParameterName = "u";
	/**
	 * Return the J2EE user name.
	 */
	protected Object getPreAuthenticatedPrincipal(HttpServletRequest httpRequest) {
		Object principal = httpRequest.getParameter(userParameterName) == null ? null : httpRequest.
				getParameter(userParameterName);
		if (logger.isDebugEnabled()) {
			logger.debug("PreAuthenticated J2EE principal: " + principal);
		}
		return principal;
	}

	/**
	 * For J2EE container-based authentication there is no generic way to retrieve the
	 * credentials, as such this method returns a fixed dummy value.
	 */
	protected Object getPreAuthenticatedCredentials(HttpServletRequest httpRequest) {
		return "N/A";
	}
}
