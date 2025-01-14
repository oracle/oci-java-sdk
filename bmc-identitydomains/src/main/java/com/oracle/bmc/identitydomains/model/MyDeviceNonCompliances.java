/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Device Non Compliances <br>
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
        builder = MyDeviceNonCompliances.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MyDeviceNonCompliances
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "action"})
    public MyDeviceNonCompliances(String name, String value, Action action) {
        super();
        this.name = name;
        this.value = value;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Device Compliance name
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Device Compliance name
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Device Compliance value
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Device Compliance value
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Device Compliance Action
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * Device Compliance Action
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: true - returned: default - type: string - uniqueness: none -
         * idcsRequiresWriteForAccessFlows: true -
         * idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyDeviceNonCompliances build() {
            MyDeviceNonCompliances model =
                    new MyDeviceNonCompliances(this.name, this.value, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyDeviceNonCompliances model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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
     * Device Compliance name
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Device Compliance name
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Device Compliance value
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Device Compliance value
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Device Compliance Action
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Notify("NOTIFY"),
        Block("BLOCK"),
        Allow("ALLOW"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Device Compliance Action
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Device Compliance Action
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: true - returned: default - type: string - uniqueness: none -
     * idcsRequiresWriteForAccessFlows: true - idcsRequiresImmediateReadAfterWriteForAccessFlows:
     * true
     *
     * @return the value
     */
    public Action getAction() {
        return action;
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
        sb.append("MyDeviceNonCompliances(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyDeviceNonCompliances)) {
            return false;
        }

        MyDeviceNonCompliances other = (MyDeviceNonCompliances) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
