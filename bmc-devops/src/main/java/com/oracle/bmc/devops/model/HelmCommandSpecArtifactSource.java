/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies Helm command spec details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HelmCommandSpecArtifactSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployArtifactSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HelmCommandSpecArtifactSource extends DeployArtifactSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Helm commands to be executed, base 64 encoded
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedContent")
        private String base64EncodedContent;

        /**
         * The Helm commands to be executed, base 64 encoded
         * @param base64EncodedContent the value to set
         * @return this builder
         **/
        public Builder base64EncodedContent(String base64EncodedContent) {
            this.base64EncodedContent = base64EncodedContent;
            this.__explicitlySet__.add("base64EncodedContent");
            return this;
        }
        /**
         * Specifies types of artifact sources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helmArtifactSourceType")
        private HelmArtifactSourceType helmArtifactSourceType;

        /**
         * Specifies types of artifact sources.
         * @param helmArtifactSourceType the value to set
         * @return this builder
         **/
        public Builder helmArtifactSourceType(HelmArtifactSourceType helmArtifactSourceType) {
            this.helmArtifactSourceType = helmArtifactSourceType;
            this.__explicitlySet__.add("helmArtifactSourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HelmCommandSpecArtifactSource build() {
            HelmCommandSpecArtifactSource model =
                    new HelmCommandSpecArtifactSource(
                            this.base64EncodedContent, this.helmArtifactSourceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HelmCommandSpecArtifactSource model) {
            if (model.wasPropertyExplicitlySet("base64EncodedContent")) {
                this.base64EncodedContent(model.getBase64EncodedContent());
            }
            if (model.wasPropertyExplicitlySet("helmArtifactSourceType")) {
                this.helmArtifactSourceType(model.getHelmArtifactSourceType());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public HelmCommandSpecArtifactSource(
            String base64EncodedContent, HelmArtifactSourceType helmArtifactSourceType) {
        super();
        this.base64EncodedContent = base64EncodedContent;
        this.helmArtifactSourceType = helmArtifactSourceType;
    }

    /**
     * The Helm commands to be executed, base 64 encoded
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedContent")
    private final String base64EncodedContent;

    /**
     * The Helm commands to be executed, base 64 encoded
     * @return the value
     **/
    public String getBase64EncodedContent() {
        return base64EncodedContent;
    }

    /**
     * Specifies types of artifact sources.
     **/
    public enum HelmArtifactSourceType {
        Inline("INLINE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HelmArtifactSourceType.class);

        private final String value;
        private static java.util.Map<String, HelmArtifactSourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (HelmArtifactSourceType v : HelmArtifactSourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HelmArtifactSourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HelmArtifactSourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HelmArtifactSourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies types of artifact sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helmArtifactSourceType")
    private final HelmArtifactSourceType helmArtifactSourceType;

    /**
     * Specifies types of artifact sources.
     * @return the value
     **/
    public HelmArtifactSourceType getHelmArtifactSourceType() {
        return helmArtifactSourceType;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("HelmCommandSpecArtifactSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", base64EncodedContent=").append(String.valueOf(this.base64EncodedContent));
        sb.append(", helmArtifactSourceType=").append(String.valueOf(this.helmArtifactSourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HelmCommandSpecArtifactSource)) {
            return false;
        }

        HelmCommandSpecArtifactSource other = (HelmCommandSpecArtifactSource) o;
        return java.util.Objects.equals(this.base64EncodedContent, other.base64EncodedContent)
                && java.util.Objects.equals(
                        this.helmArtifactSourceType, other.helmArtifactSourceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.base64EncodedContent == null
                                ? 43
                                : this.base64EncodedContent.hashCode());
        result =
                (result * PRIME)
                        + (this.helmArtifactSourceType == null
                                ? 43
                                : this.helmArtifactSourceType.hashCode());
        return result;
    }
}
