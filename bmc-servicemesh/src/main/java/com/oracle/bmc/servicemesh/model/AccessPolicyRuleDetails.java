/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Access policy rule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AccessPolicyRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AccessPolicyRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "source", "destination"})
    public AccessPolicyRuleDetails(
            Action action,
            AccessPolicyTargetDetails source,
            AccessPolicyTargetDetails destination) {
        super();
        this.action = action;
        this.source = source;
        this.destination = destination;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Action for the traffic between the source and the destination. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * Action for the traffic between the source and the destination.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private AccessPolicyTargetDetails source;

        public Builder source(AccessPolicyTargetDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("destination")
        private AccessPolicyTargetDetails destination;

        public Builder destination(AccessPolicyTargetDetails destination) {
            this.destination = destination;
            this.__explicitlySet__.add("destination");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessPolicyRuleDetails build() {
            AccessPolicyRuleDetails model =
                    new AccessPolicyRuleDetails(this.action, this.source, this.destination);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessPolicyRuleDetails model) {
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("destination")) {
                this.destination(model.getDestination());
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

    /** Action for the traffic between the source and the destination. */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Allow("ALLOW"),
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
    /** Action for the traffic between the source and the destination. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Action for the traffic between the source and the destination.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final AccessPolicyTargetDetails source;

    public AccessPolicyTargetDetails getSource() {
        return source;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final AccessPolicyTargetDetails destination;

    public AccessPolicyTargetDetails getDestination() {
        return destination;
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
        sb.append("AccessPolicyRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", destination=").append(String.valueOf(this.destination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessPolicyRuleDetails)) {
            return false;
        }

        AccessPolicyRuleDetails other = (AccessPolicyRuleDetails) o;
        return java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.destination, other.destination)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
