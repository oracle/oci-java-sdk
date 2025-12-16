/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create a mapping of OKE namespaces to config maps for an OKE member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOkeClusterResourceModifierMappingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOkeClusterResourceModifierMappingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "configMap"})
    public CreateOkeClusterResourceModifierMappingDetails(String namespace, String configMap) {
        super();
        this.namespace = namespace;
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OKE namespace where the config map resides. Example: {@code namespace_string_5} */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The OKE namespace where the config map resides. Example: {@code namespace_string_5}
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the config map containing resource modification details. Example: {@code
         * resource-modifier}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configMap")
        private String configMap;

        /**
         * The name of the config map containing resource modification details. Example: {@code
         * resource-modifier}
         *
         * @param configMap the value to set
         * @return this builder
         */
        public Builder configMap(String configMap) {
            this.configMap = configMap;
            this.__explicitlySet__.add("configMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOkeClusterResourceModifierMappingDetails build() {
            CreateOkeClusterResourceModifierMappingDetails model =
                    new CreateOkeClusterResourceModifierMappingDetails(
                            this.namespace, this.configMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOkeClusterResourceModifierMappingDetails model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("configMap")) {
                this.configMap(model.getConfigMap());
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

    /** The OKE namespace where the config map resides. Example: {@code namespace_string_5} */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The OKE namespace where the config map resides. Example: {@code namespace_string_5}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The name of the config map containing resource modification details. Example: {@code
     * resource-modifier}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    private final String configMap;

    /**
     * The name of the config map containing resource modification details. Example: {@code
     * resource-modifier}
     *
     * @return the value
     */
    public String getConfigMap() {
        return configMap;
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
        sb.append("CreateOkeClusterResourceModifierMappingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", configMap=").append(String.valueOf(this.configMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOkeClusterResourceModifierMappingDetails)) {
            return false;
        }

        CreateOkeClusterResourceModifierMappingDetails other =
                (CreateOkeClusterResourceModifierMappingDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.configMap, other.configMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.configMap == null ? 43 : this.configMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
