/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to manage Multi-Factor Authentication settings of third
 * party provider <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionThirdPartyAuthenticationFactorSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionThirdPartyAuthenticationFactorSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"duoSecuritySettings"})
    public ExtensionThirdPartyAuthenticationFactorSettings(
            AuthenticationFactorSettingsDuoSecuritySettings duoSecuritySettings) {
        super();
        this.duoSecuritySettings = duoSecuritySettings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("duoSecuritySettings")
        private AuthenticationFactorSettingsDuoSecuritySettings duoSecuritySettings;

        public Builder duoSecuritySettings(
                AuthenticationFactorSettingsDuoSecuritySettings duoSecuritySettings) {
            this.duoSecuritySettings = duoSecuritySettings;
            this.__explicitlySet__.add("duoSecuritySettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionThirdPartyAuthenticationFactorSettings build() {
            ExtensionThirdPartyAuthenticationFactorSettings model =
                    new ExtensionThirdPartyAuthenticationFactorSettings(this.duoSecuritySettings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionThirdPartyAuthenticationFactorSettings model) {
            if (model.wasPropertyExplicitlySet("duoSecuritySettings")) {
                this.duoSecuritySettings(model.getDuoSecuritySettings());
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

    @com.fasterxml.jackson.annotation.JsonProperty("duoSecuritySettings")
    private final AuthenticationFactorSettingsDuoSecuritySettings duoSecuritySettings;

    public AuthenticationFactorSettingsDuoSecuritySettings getDuoSecuritySettings() {
        return duoSecuritySettings;
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
        sb.append("ExtensionThirdPartyAuthenticationFactorSettings(");
        sb.append("super=").append(super.toString());
        sb.append("duoSecuritySettings=").append(String.valueOf(this.duoSecuritySettings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionThirdPartyAuthenticationFactorSettings)) {
            return false;
        }

        ExtensionThirdPartyAuthenticationFactorSettings other =
                (ExtensionThirdPartyAuthenticationFactorSettings) o;
        return java.util.Objects.equals(this.duoSecuritySettings, other.duoSecuritySettings)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.duoSecuritySettings == null
                                ? 43
                                : this.duoSecuritySettings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
