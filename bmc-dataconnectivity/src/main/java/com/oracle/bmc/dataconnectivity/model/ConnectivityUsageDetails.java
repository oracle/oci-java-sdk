/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Input details to ConnectivityUsage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConnectivityUsageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConnectivityUsageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionKey", "action", "consumingService"})
    public ConnectivityUsageDetails(String connectionKey, String action, String consumingService) {
        super();
        this.connectionKey = connectionKey;
        this.action = action;
        this.consumingService = consumingService;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** connection Key. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * connection Key.
         *
         * @param connectionKey the value to set
         * @return this builder
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }
        /** Action type where connection used. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * Action type where connection used.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** Consuming serviceType where connection used. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumingService")
        private String consumingService;

        /**
         * Consuming serviceType where connection used.
         *
         * @param consumingService the value to set
         * @return this builder
         */
        public Builder consumingService(String consumingService) {
            this.consumingService = consumingService;
            this.__explicitlySet__.add("consumingService");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectivityUsageDetails build() {
            ConnectivityUsageDetails model =
                    new ConnectivityUsageDetails(
                            this.connectionKey, this.action, this.consumingService);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectivityUsageDetails model) {
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("consumingService")) {
                this.consumingService(model.getConsumingService());
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

    /** connection Key. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * connection Key.
     *
     * @return the value
     */
    public String getConnectionKey() {
        return connectionKey;
    }

    /** Action type where connection used. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * Action type where connection used.
     *
     * @return the value
     */
    public String getAction() {
        return action;
    }

    /** Consuming serviceType where connection used. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumingService")
    private final String consumingService;

    /**
     * Consuming serviceType where connection used.
     *
     * @return the value
     */
    public String getConsumingService() {
        return consumingService;
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
        sb.append("ConnectivityUsageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", consumingService=").append(String.valueOf(this.consumingService));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectivityUsageDetails)) {
            return false;
        }

        ConnectivityUsageDetails other = (ConnectivityUsageDetails) o;
        return java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.consumingService, other.consumingService)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.consumingService == null ? 43 : this.consumingService.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
