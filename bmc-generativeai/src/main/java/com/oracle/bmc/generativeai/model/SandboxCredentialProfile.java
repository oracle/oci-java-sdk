/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * A named Project-local credential profile selected explicitly when a Sandbox is created. Profiles
 * can be added, removed, or changed through Project Update. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxCredentialProfile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxCredentialProfile
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"label", "credentialInjectionRules"})
    public SandboxCredentialProfile(
            String label, java.util.List<SandboxCredentialInjectionRule> credentialInjectionRules) {
        super();
        this.label = label;
        this.credentialInjectionRules = credentialInjectionRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Required, unique Project-local selector. The value {@code project-default} is reserved by
         * the service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Required, unique Project-local selector. The value {@code project-default} is reserved by
         * the service.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * One or more credential injection rules. A rule authorizes credential injection only; it
         * does not grant network reachability. Each selected request reads the referenced OCI Vault
         * secret at the {@code CURRENT} stage; secret values are not cached or served stale.
         * Protected requests support HTTP/1.1 and HTTP/2. CONNECT, extended CONNECT, Upgrade,
         * WebSocket, plain HTTP, and non-HTTP credentials are not supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("credentialInjectionRules")
        private java.util.List<SandboxCredentialInjectionRule> credentialInjectionRules;

        /**
         * One or more credential injection rules. A rule authorizes credential injection only; it
         * does not grant network reachability. Each selected request reads the referenced OCI Vault
         * secret at the {@code CURRENT} stage; secret values are not cached or served stale.
         * Protected requests support HTTP/1.1 and HTTP/2. CONNECT, extended CONNECT, Upgrade,
         * WebSocket, plain HTTP, and non-HTTP credentials are not supported.
         *
         * @param credentialInjectionRules the value to set
         * @return this builder
         */
        public Builder credentialInjectionRules(
                java.util.List<SandboxCredentialInjectionRule> credentialInjectionRules) {
            this.credentialInjectionRules = credentialInjectionRules;
            this.__explicitlySet__.add("credentialInjectionRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxCredentialProfile build() {
            SandboxCredentialProfile model =
                    new SandboxCredentialProfile(this.label, this.credentialInjectionRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxCredentialProfile model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("credentialInjectionRules")) {
                this.credentialInjectionRules(model.getCredentialInjectionRules());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Required, unique Project-local selector. The value {@code project-default} is reserved by the
     * service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Required, unique Project-local selector. The value {@code project-default} is reserved by the
     * service.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /**
     * One or more credential injection rules. A rule authorizes credential injection only; it does
     * not grant network reachability. Each selected request reads the referenced OCI Vault secret
     * at the {@code CURRENT} stage; secret values are not cached or served stale. Protected
     * requests support HTTP/1.1 and HTTP/2. CONNECT, extended CONNECT, Upgrade, WebSocket, plain
     * HTTP, and non-HTTP credentials are not supported.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialInjectionRules")
    private final java.util.List<SandboxCredentialInjectionRule> credentialInjectionRules;

    /**
     * One or more credential injection rules. A rule authorizes credential injection only; it does
     * not grant network reachability. Each selected request reads the referenced OCI Vault secret
     * at the {@code CURRENT} stage; secret values are not cached or served stale. Protected
     * requests support HTTP/1.1 and HTTP/2. CONNECT, extended CONNECT, Upgrade, WebSocket, plain
     * HTTP, and non-HTTP credentials are not supported.
     *
     * @return the value
     */
    public java.util.List<SandboxCredentialInjectionRule> getCredentialInjectionRules() {
        return credentialInjectionRules;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SandboxCredentialProfile(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", credentialInjectionRules=")
                .append(String.valueOf(this.credentialInjectionRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCredentialProfile)) {
            return false;
        }

        SandboxCredentialProfile other = (SandboxCredentialProfile) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(
                        this.credentialInjectionRules, other.credentialInjectionRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialInjectionRules == null
                                ? 43
                                : this.credentialInjectionRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
