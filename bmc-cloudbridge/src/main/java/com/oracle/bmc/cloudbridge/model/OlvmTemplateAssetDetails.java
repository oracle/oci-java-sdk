/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * OLVM Template type of asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmTemplateAssetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmTemplateAssetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"olvmTemplate"})
    public OlvmTemplateAssetDetails(OlvmTemplateProperties olvmTemplate) {
        super();
        this.olvmTemplate = olvmTemplate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("olvmTemplate")
        private OlvmTemplateProperties olvmTemplate;

        public Builder olvmTemplate(OlvmTemplateProperties olvmTemplate) {
            this.olvmTemplate = olvmTemplate;
            this.__explicitlySet__.add("olvmTemplate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmTemplateAssetDetails build() {
            OlvmTemplateAssetDetails model = new OlvmTemplateAssetDetails(this.olvmTemplate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmTemplateAssetDetails model) {
            if (model.wasPropertyExplicitlySet("olvmTemplate")) {
                this.olvmTemplate(model.getOlvmTemplate());
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

    @com.fasterxml.jackson.annotation.JsonProperty("olvmTemplate")
    private final OlvmTemplateProperties olvmTemplate;

    public OlvmTemplateProperties getOlvmTemplate() {
        return olvmTemplate;
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
        sb.append("OlvmTemplateAssetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("olvmTemplate=").append(String.valueOf(this.olvmTemplate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmTemplateAssetDetails)) {
            return false;
        }

        OlvmTemplateAssetDetails other = (OlvmTemplateAssetDetails) o;
        return java.util.Objects.equals(this.olvmTemplate, other.olvmTemplate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.olvmTemplate == null ? 43 : this.olvmTemplate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
