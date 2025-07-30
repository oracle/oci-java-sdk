/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiplatform.model;

/**
 * Service URIs pertaining to the instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240829")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Uris.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Uris extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"managementPortalUri", "developersPortalUri"})
    public Uris(String managementPortalUri, String developersPortalUri) {
        super();
        this.managementPortalUri = managementPortalUri;
        this.developersPortalUri = developersPortalUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Management Portal URI of the instance (/apiplatform) */
        @com.fasterxml.jackson.annotation.JsonProperty("managementPortalUri")
        private String managementPortalUri;

        /**
         * Management Portal URI of the instance (/apiplatform)
         *
         * @param managementPortalUri the value to set
         * @return this builder
         */
        public Builder managementPortalUri(String managementPortalUri) {
            this.managementPortalUri = managementPortalUri;
            this.__explicitlySet__.add("managementPortalUri");
            return this;
        }
        /** Developer's Portal URI of the instance (/developers) */
        @com.fasterxml.jackson.annotation.JsonProperty("developersPortalUri")
        private String developersPortalUri;

        /**
         * Developer's Portal URI of the instance (/developers)
         *
         * @param developersPortalUri the value to set
         * @return this builder
         */
        public Builder developersPortalUri(String developersPortalUri) {
            this.developersPortalUri = developersPortalUri;
            this.__explicitlySet__.add("developersPortalUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Uris build() {
            Uris model = new Uris(this.managementPortalUri, this.developersPortalUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Uris model) {
            if (model.wasPropertyExplicitlySet("managementPortalUri")) {
                this.managementPortalUri(model.getManagementPortalUri());
            }
            if (model.wasPropertyExplicitlySet("developersPortalUri")) {
                this.developersPortalUri(model.getDevelopersPortalUri());
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

    /** Management Portal URI of the instance (/apiplatform) */
    @com.fasterxml.jackson.annotation.JsonProperty("managementPortalUri")
    private final String managementPortalUri;

    /**
     * Management Portal URI of the instance (/apiplatform)
     *
     * @return the value
     */
    public String getManagementPortalUri() {
        return managementPortalUri;
    }

    /** Developer's Portal URI of the instance (/developers) */
    @com.fasterxml.jackson.annotation.JsonProperty("developersPortalUri")
    private final String developersPortalUri;

    /**
     * Developer's Portal URI of the instance (/developers)
     *
     * @return the value
     */
    public String getDevelopersPortalUri() {
        return developersPortalUri;
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
        sb.append("Uris(");
        sb.append("super=").append(super.toString());
        sb.append("managementPortalUri=").append(String.valueOf(this.managementPortalUri));
        sb.append(", developersPortalUri=").append(String.valueOf(this.developersPortalUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Uris)) {
            return false;
        }

        Uris other = (Uris) o;
        return java.util.Objects.equals(this.managementPortalUri, other.managementPortalUri)
                && java.util.Objects.equals(this.developersPortalUri, other.developersPortalUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managementPortalUri == null
                                ? 43
                                : this.managementPortalUri.hashCode());
        result =
                (result * PRIME)
                        + (this.developersPortalUri == null
                                ? 43
                                : this.developersPortalUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
