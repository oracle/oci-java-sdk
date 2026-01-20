/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The data for pre-termination action for an instance pool <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolPreTerminationActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolPreTerminationActionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "timeout", "onTimeout"})
    public InstancePoolPreTerminationActionDetails(
            Boolean isEnabled,
            Integer timeout,
            InstancePoolPreTerminationActionHandleTimeoutDetails onTimeout) {
        super();
        this.isEnabled = isEnabled;
        this.timeout = timeout;
        this.onTimeout = onTimeout;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether pre-termination action is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether pre-termination action is enabled or not.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The timeout in seconds for pre-termination action for an instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private Integer timeout;

        /**
         * The timeout in seconds for pre-termination action for an instance pool.
         *
         * @param timeout the value to set
         * @return this builder
         */
        public Builder timeout(Integer timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onTimeout")
        private InstancePoolPreTerminationActionHandleTimeoutDetails onTimeout;

        public Builder onTimeout(InstancePoolPreTerminationActionHandleTimeoutDetails onTimeout) {
            this.onTimeout = onTimeout;
            this.__explicitlySet__.add("onTimeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolPreTerminationActionDetails build() {
            InstancePoolPreTerminationActionDetails model =
                    new InstancePoolPreTerminationActionDetails(
                            this.isEnabled, this.timeout, this.onTimeout);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolPreTerminationActionDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeout")) {
                this.timeout(model.getTimeout());
            }
            if (model.wasPropertyExplicitlySet("onTimeout")) {
                this.onTimeout(model.getOnTimeout());
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

    /** Whether pre-termination action is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether pre-termination action is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The timeout in seconds for pre-termination action for an instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final Integer timeout;

    /**
     * The timeout in seconds for pre-termination action for an instance pool.
     *
     * @return the value
     */
    public Integer getTimeout() {
        return timeout;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("onTimeout")
    private final InstancePoolPreTerminationActionHandleTimeoutDetails onTimeout;

    public InstancePoolPreTerminationActionHandleTimeoutDetails getOnTimeout() {
        return onTimeout;
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
        sb.append("InstancePoolPreTerminationActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(", onTimeout=").append(String.valueOf(this.onTimeout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolPreTerminationActionDetails)) {
            return false;
        }

        InstancePoolPreTerminationActionDetails other = (InstancePoolPreTerminationActionDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && java.util.Objects.equals(this.onTimeout, other.onTimeout)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + (this.onTimeout == null ? 43 : this.onTimeout.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
