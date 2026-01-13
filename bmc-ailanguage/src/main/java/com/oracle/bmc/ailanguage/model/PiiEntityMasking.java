/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Mask recognized PII entities with different modes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "mode",
        defaultImpl = PiiEntityMasking.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PiiEntityRelexify.class,
            name = "RELEXIFY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PiiEntityReplace.class,
            name = "REPLACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PiiEntityRemove.class,
            name = "REMOVE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PiiEntityMask.class, name = "MASK")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PiiEntityMasking extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"exclude", "shouldDetect"})
    protected PiiEntityMasking(java.util.List<String> exclude, Boolean shouldDetect) {
        super();
        this.exclude = exclude;
        this.shouldDetect = shouldDetect;
    }

    /** List of offsets/entities to be removed from anonymization. */
    @com.fasterxml.jackson.annotation.JsonProperty("exclude")
    private final java.util.List<String> exclude;

    /**
     * List of offsets/entities to be removed from anonymization.
     *
     * @return the value
     */
    public java.util.List<String> getExclude() {
        return exclude;
    }

    /** To include excluded entities from masking in detected entities or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldDetect")
    private final Boolean shouldDetect;

    /**
     * To include excluded entities from masking in detected entities or not.
     *
     * @return the value
     */
    public Boolean getShouldDetect() {
        return shouldDetect;
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
        sb.append("PiiEntityMasking(");
        sb.append("super=").append(super.toString());
        sb.append("exclude=").append(String.valueOf(this.exclude));
        sb.append(", shouldDetect=").append(String.valueOf(this.shouldDetect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiiEntityMasking)) {
            return false;
        }

        PiiEntityMasking other = (PiiEntityMasking) o;
        return java.util.Objects.equals(this.exclude, other.exclude)
                && java.util.Objects.equals(this.shouldDetect, other.shouldDetect)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.exclude == null ? 43 : this.exclude.hashCode());
        result = (result * PRIME) + (this.shouldDetect == null ? 43 : this.shouldDetect.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of masking mode. */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Replace("REPLACE"),
        Mask("MASK"),
        Remove("REMOVE"),
        Relexify("RELEXIFY"),
        ;

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                map.put(v.getValue(), v);
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
}
