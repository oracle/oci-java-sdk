/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Represents an action that needs to be performed by the user or client. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requiredActionType",
        defaultImpl = RequiredAction.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HumanApprovalRequiredAction.class,
            name = "HUMAN_APPROVAL_REQUIRED_ACTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FunctionCallingRequiredAction.class,
            name = "FUNCTION_CALLING_REQUIRED_ACTION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class RequiredAction extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"actionId"})
    protected RequiredAction(String actionId) {
        super();
        this.actionId = actionId;
    }

    /** The unique identifier for the action to be performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("actionId")
    private final String actionId;

    /**
     * The unique identifier for the action to be performed.
     *
     * @return the value
     */
    public String getActionId() {
        return actionId;
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
        sb.append("RequiredAction(");
        sb.append("super=").append(super.toString());
        sb.append("actionId=").append(String.valueOf(this.actionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequiredAction)) {
            return false;
        }

        RequiredAction other = (RequiredAction) o;
        return java.util.Objects.equals(this.actionId, other.actionId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionId == null ? 43 : this.actionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies the type of action. Used for determining the action subtype. */
    public enum RequiredActionType implements com.oracle.bmc.http.internal.BmcEnum {
        HumanApprovalRequiredAction("HUMAN_APPROVAL_REQUIRED_ACTION"),
        FunctionCallingRequiredAction("FUNCTION_CALLING_REQUIRED_ACTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RequiredActionType.class);

        private final String value;
        private static java.util.Map<String, RequiredActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (RequiredActionType v : RequiredActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RequiredActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequiredActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RequiredActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
