/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Details for enabling or disabling quota enforcement in the file system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ToggleQuotaRulesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ToggleQuotaRulesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"areQuotaRulesEnabled"})
    public ToggleQuotaRulesDetails(Boolean areQuotaRulesEnabled) {
        super();
        this.areQuotaRulesEnabled = areQuotaRulesEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies the enforcement of quota rules on the file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("areQuotaRulesEnabled")
        private Boolean areQuotaRulesEnabled;

        /**
         * Specifies the enforcement of quota rules on the file system.
         *
         * @param areQuotaRulesEnabled the value to set
         * @return this builder
         */
        public Builder areQuotaRulesEnabled(Boolean areQuotaRulesEnabled) {
            this.areQuotaRulesEnabled = areQuotaRulesEnabled;
            this.__explicitlySet__.add("areQuotaRulesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ToggleQuotaRulesDetails build() {
            ToggleQuotaRulesDetails model = new ToggleQuotaRulesDetails(this.areQuotaRulesEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ToggleQuotaRulesDetails model) {
            if (model.wasPropertyExplicitlySet("areQuotaRulesEnabled")) {
                this.areQuotaRulesEnabled(model.getAreQuotaRulesEnabled());
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

    /** Specifies the enforcement of quota rules on the file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("areQuotaRulesEnabled")
    private final Boolean areQuotaRulesEnabled;

    /**
     * Specifies the enforcement of quota rules on the file system.
     *
     * @return the value
     */
    public Boolean getAreQuotaRulesEnabled() {
        return areQuotaRulesEnabled;
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
        sb.append("ToggleQuotaRulesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("areQuotaRulesEnabled=").append(String.valueOf(this.areQuotaRulesEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToggleQuotaRulesDetails)) {
            return false;
        }

        ToggleQuotaRulesDetails other = (ToggleQuotaRulesDetails) o;
        return java.util.Objects.equals(this.areQuotaRulesEnabled, other.areQuotaRulesEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.areQuotaRulesEnabled == null
                                ? 43
                                : this.areQuotaRulesEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
