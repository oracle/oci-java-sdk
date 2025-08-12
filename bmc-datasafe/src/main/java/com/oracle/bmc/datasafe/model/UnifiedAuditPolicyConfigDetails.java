/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The unified audit policy related configurations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAuditPolicyConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAuditPolicyConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"excludeDatasafeUser"})
    public UnifiedAuditPolicyConfigDetails(ExcludeDatasafeUser excludeDatasafeUser) {
        super();
        this.excludeDatasafeUser = excludeDatasafeUser;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether the Data Safe service account on the target database should be excluded
         * in the unified audit policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeDatasafeUser")
        private ExcludeDatasafeUser excludeDatasafeUser;

        /**
         * Specifies whether the Data Safe service account on the target database should be excluded
         * in the unified audit policy.
         *
         * @param excludeDatasafeUser the value to set
         * @return this builder
         */
        public Builder excludeDatasafeUser(ExcludeDatasafeUser excludeDatasafeUser) {
            this.excludeDatasafeUser = excludeDatasafeUser;
            this.__explicitlySet__.add("excludeDatasafeUser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAuditPolicyConfigDetails build() {
            UnifiedAuditPolicyConfigDetails model =
                    new UnifiedAuditPolicyConfigDetails(this.excludeDatasafeUser);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAuditPolicyConfigDetails model) {
            if (model.wasPropertyExplicitlySet("excludeDatasafeUser")) {
                this.excludeDatasafeUser(model.getExcludeDatasafeUser());
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
     * Specifies whether the Data Safe service account on the target database should be excluded in
     * the unified audit policy.
     */
    public enum ExcludeDatasafeUser implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, ExcludeDatasafeUser> map;

        static {
            map = new java.util.HashMap<>();
            for (ExcludeDatasafeUser v : ExcludeDatasafeUser.values()) {
                map.put(v.getValue(), v);
            }
        }

        ExcludeDatasafeUser(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExcludeDatasafeUser create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ExcludeDatasafeUser: " + key);
        }
    };
    /**
     * Specifies whether the Data Safe service account on the target database should be excluded in
     * the unified audit policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeDatasafeUser")
    private final ExcludeDatasafeUser excludeDatasafeUser;

    /**
     * Specifies whether the Data Safe service account on the target database should be excluded in
     * the unified audit policy.
     *
     * @return the value
     */
    public ExcludeDatasafeUser getExcludeDatasafeUser() {
        return excludeDatasafeUser;
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
        sb.append("UnifiedAuditPolicyConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("excludeDatasafeUser=").append(String.valueOf(this.excludeDatasafeUser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAuditPolicyConfigDetails)) {
            return false;
        }

        UnifiedAuditPolicyConfigDetails other = (UnifiedAuditPolicyConfigDetails) o;
        return java.util.Objects.equals(this.excludeDatasafeUser, other.excludeDatasafeUser)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.excludeDatasafeUser == null
                                ? 43
                                : this.excludeDatasafeUser.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
