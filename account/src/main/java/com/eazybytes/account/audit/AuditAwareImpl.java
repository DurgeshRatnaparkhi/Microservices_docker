package com.eazybytes.account.audit;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditorAware")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // Return the current auditor (e.g., the username of the logged-in user)
        return Optional.of("system"); // Replace with actual logic to retrieve the current user
    }
}
