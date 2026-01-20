/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Reference to an application component <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ApplicationComponent.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataScienceJobApplicationComponent.class,
            name = "DATA_SCIENCE_JOB"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataFlowApplicationApplicationComponent.class,
            name = "DATA_FLOW_APPLICATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericOciResourceApplicationComponent.class,
            name = "GENERIC_OCI_RESOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataSciencePipelineApplicationComponent.class,
            name = "DATA_SCIENCE_PIPELINE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataScienceModelApplicationComponent.class,
            name = "DATA_SCIENCE_MODEL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ApplicationComponent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "componentName"})
    protected ApplicationComponent(String name, String componentName) {
        super();
        this.name = name;
        this.componentName = componentName;
    }

    /**
     * Name of referenced resource (generally resources do not have to have any name but most
     * resources have name exposed as 'name' or 'displayName' field).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of referenced resource (generally resources do not have to have any name but most
     * resources have name exposed as 'name' or 'displayName' field).
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Name of application component */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * Name of application component
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
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
        sb.append("ApplicationComponent(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationComponent)) {
            return false;
        }

        ApplicationComponent other = (ApplicationComponent) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of application component */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        DataSciencePipeline("DATA_SCIENCE_PIPELINE"),
        DataScienceJob("DATA_SCIENCE_JOB"),
        DataScienceModel("DATA_SCIENCE_MODEL"),
        DataFlowApplication("DATA_FLOW_APPLICATION"),
        GenericOciResource("GENERIC_OCI_RESOURCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
