/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.events.model;

/**
 * Object used to create an action. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType",
        defaultImpl = ActionDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateStreamingServiceActionDetails.class,
            name = "OSS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateFaaSActionDetails.class,
            name = "FAAS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateNotificationServiceActionDetails.class,
            name = "ONS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ActionDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "description"})
    protected ActionDetails(Boolean isEnabled, String description) {
        super();
        this.isEnabled = isEnabled;
        this.description = description;
    }

    /**
     * Whether or not this action is currently enabled.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether or not this action is currently enabled.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * A string that describes the details of the action. It does not have to be unique, and you can
     * change it. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A string that describes the details of the action. It does not have to be unique, and you can
     * change it. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("ActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActionDetails)) {
            return false;
        }

        ActionDetails other = (ActionDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The action to perform if the condition in the rule matches an event.
     *
     * <p>**ONS:** Send to an Oracle Notification Service topic. * **OSS:** Send to a stream from
     * Oracle Streaming Service. * **FAAS:** Send to an Oracle Functions Service endpoint.
     */
    public enum ActionType implements com.oracle.bmc.http.internal.BmcEnum {
        Ons("ONS"),
        Oss("OSS"),
        Faas("FAAS"),
        ;

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ActionType: " + key);
        }
    };
}
