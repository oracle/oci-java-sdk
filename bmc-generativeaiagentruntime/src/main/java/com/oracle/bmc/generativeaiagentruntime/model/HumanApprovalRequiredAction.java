/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * An object describing human confirmation of tool execution that is required from the user. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HumanApprovalRequiredAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "requiredActionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HumanApprovalRequiredAction extends RequiredAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionId")
        private String actionId;

        public Builder actionId(String actionId) {
            this.actionId = actionId;
            this.__explicitlySet__.add("actionId");
            return this;
        }
        /**
         * Message accompanying the human input request asking for approval or denial of a tool
         * execution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Message accompanying the human input request asking for approval or denial of a tool
         * execution.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The options presented to the user approving and denying execution of the tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<Options> options;

        /**
         * The options presented to the user approving and denying execution of the tool.
         *
         * @param options the value to set
         * @return this builder
         */
        public Builder options(java.util.List<Options> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HumanApprovalRequiredAction build() {
            HumanApprovalRequiredAction model =
                    new HumanApprovalRequiredAction(this.actionId, this.message, this.options);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HumanApprovalRequiredAction model) {
            if (model.wasPropertyExplicitlySet("actionId")) {
                this.actionId(model.getActionId());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
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

    @Deprecated
    public HumanApprovalRequiredAction(
            String actionId, String message, java.util.List<Options> options) {
        super(actionId);
        this.message = message;
        this.options = options;
    }

    /**
     * Message accompanying the human input request asking for approval or denial of a tool
     * execution.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Message accompanying the human input request asking for approval or denial of a tool
     * execution.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** */
    public enum Options implements com.oracle.bmc.http.internal.BmcEnum {
        Approve("APPROVE"),
        Deny("DENY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Options.class);

        private final String value;
        private static java.util.Map<String, Options> map;

        static {
            map = new java.util.HashMap<>();
            for (Options v : Options.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Options(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Options create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Options', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The options presented to the user approving and denying execution of the tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.List<Options> options;

    /**
     * The options presented to the user approving and denying execution of the tool.
     *
     * @return the value
     */
    public java.util.List<Options> getOptions() {
        return options;
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
        sb.append("HumanApprovalRequiredAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HumanApprovalRequiredAction)) {
            return false;
        }

        HumanApprovalRequiredAction other = (HumanApprovalRequiredAction) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.options, other.options)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        return result;
    }
}
