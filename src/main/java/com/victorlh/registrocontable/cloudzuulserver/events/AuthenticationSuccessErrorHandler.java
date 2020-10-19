package com.victorlh.registrocontable.cloudzuulserver.events;

import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationSuccessErrorHandler implements AuthenticationEventPublisher {

//	private final Logger logger = LoggerFactory.getLogger(AuthenticationSuccessErrorHandler.class);

	@Override
	public void publishAuthenticationSuccess(Authentication authentication) {
	}

	@Override
	public void publishAuthenticationFailure(AuthenticationException exception, Authentication authentication) {
	}

}
