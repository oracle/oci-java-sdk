/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The requested Data Safe registration action details for the database. <br>
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
        builder = DataSafeRegistrationRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataSafeRegistrationRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "connectionIds"})
    public DataSafeRegistrationRequestDetails(Action action, java.util.List<String> connectionIds) {
        super();
        this.action = action;
        this.connectionIds = connectionIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The requested Data Safe registration action for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The requested Data Safe registration action for the database.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * List of OCID(s) required to establish the connection. If using a Private Endpoint,
         * provide one Data Safe private endpoint OCID. If using On-Premises Connectors, provide the
         * OCID(s) of Data Safe on-premises connector(s).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionIds")
        private java.util.List<String> connectionIds;

        /**
         * List of OCID(s) required to establish the connection. If using a Private Endpoint,
         * provide one Data Safe private endpoint OCID. If using On-Premises Connectors, provide the
         * OCID(s) of Data Safe on-premises connector(s).
         *
         * @param connectionIds the value to set
         * @return this builder
         */
        public Builder connectionIds(java.util.List<String> connectionIds) {
            this.connectionIds = connectionIds;
            this.__explicitlySet__.add("connectionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataSafeRegistrationRequestDetails build() {
            DataSafeRegistrationRequestDetails model =
                    new DataSafeRegistrationRequestDetails(this.action, this.connectionIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataSafeRegistrationRequestDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("connectionIds")) {
                this.connectionIds(model.getConnectionIds());
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

    /** The requested Data Safe registration action for the database. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Register("REGISTER"),
        Unregister("UNREGISTER"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /** The requested Data Safe registration action for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The requested Data Safe registration action for the database.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * List of OCID(s) required to establish the connection. If using a Private Endpoint, provide
     * one Data Safe private endpoint OCID. If using On-Premises Connectors, provide the OCID(s) of
     * Data Safe on-premises connector(s).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionIds")
    private final java.util.List<String> connectionIds;

    /**
     * List of OCID(s) required to establish the connection. If using a Private Endpoint, provide
     * one Data Safe private endpoint OCID. If using On-Premises Connectors, provide the OCID(s) of
     * Data Safe on-premises connector(s).
     *
     * @return the value
     */
    public java.util.List<String> getConnectionIds() {
        return connectionIds;
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
        sb.append("DataSafeRegistrationRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", connectionIds=").append(String.valueOf(this.connectionIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataSafeRegistrationRequestDetails)) {
            return false;
        }

        DataSafeRegistrationRequestDetails other = (DataSafeRegistrationRequestDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.connectionIds, other.connectionIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionIds == null ? 43 : this.connectionIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
