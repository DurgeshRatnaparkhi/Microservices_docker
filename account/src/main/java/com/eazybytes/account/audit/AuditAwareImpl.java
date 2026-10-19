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
// this class implements the AuditorAware interface from Spring Data JPA, which is used for auditing purposes. The getCurrentAuditor() method returns the current auditor, which in this case is hardcoded to "system". In a real application, you would replace this with logic to retrieve the actual username of the logged-in user.
