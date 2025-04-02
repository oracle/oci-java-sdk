/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Reference to instance component <br>
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
        defaultImpl = InstanceComponent.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataScienceModelDeploymentInstanceComponent.class,
            name = "DATA_SCIENCE_MODEL_DEPLOYMENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericOciResourceInstanceComponent.class,
            name = "GENERIC_OCI_RESOURCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = MlApplicationInstanceInternalTrigger.class,
            name = "ML_APPLICATION_INSTANCE_INTERNAL_TRIGGER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DataScienceScheduleInstanceComponent.class,
            name = "DATA_SCIENCE_SCHEDULE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ObjectStorageObjectInstanceComponent.class,
            name = "OBJECT_STORAGE_OBJECT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ObjectStorageBucketInstanceComponent.class,
            name = "OBJECT_STORAGE_BUCKET")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class InstanceComponent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "componentName"})
    protected InstanceComponent(String name, String componentName) {
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

    /** Name of instance component */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * Name of instance component
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
        sb.append("InstanceComponent(");
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
        if (!(o instanceof InstanceComponent)) {
            return false;
        }

        InstanceComponent other = (InstanceComponent) o;
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

    /** Type of instance component */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        DataScienceModelDeployment("DATA_SCIENCE_MODEL_DEPLOYMENT"),
        ObjectStorageBucket("OBJECT_STORAGE_BUCKET"),
        ObjectStorageObject("OBJECT_STORAGE_OBJECT"),
        MlApplicationInstanceInternalTrigger("ML_APPLICATION_INSTANCE_INTERNAL_TRIGGER"),
        DataScienceSchedule("DATA_SCIENCE_SCHEDULE"),
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
