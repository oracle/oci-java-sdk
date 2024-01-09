/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Information about script parameters. isOverwritten specifies that the default parameter present
 * in the script content is overwritten. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScriptParameterInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScriptParameterInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"scriptParameter", "isOverwritten"})
    public ScriptParameterInfo(ScriptParameter scriptParameter, Boolean isOverwritten) {
        super();
        this.scriptParameter = scriptParameter;
        this.isOverwritten = isOverwritten;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scriptParameter")
        private ScriptParameter scriptParameter;

        public Builder scriptParameter(ScriptParameter scriptParameter) {
            this.scriptParameter = scriptParameter;
            this.__explicitlySet__.add("scriptParameter");
            return this;
        }
        /** If parameter value is default or overwritten. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
        private Boolean isOverwritten;

        /**
         * If parameter value is default or overwritten.
         *
         * @param isOverwritten the value to set
         * @return this builder
         */
        public Builder isOverwritten(Boolean isOverwritten) {
            this.isOverwritten = isOverwritten;
            this.__explicitlySet__.add("isOverwritten");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptParameterInfo build() {
            ScriptParameterInfo model =
                    new ScriptParameterInfo(this.scriptParameter, this.isOverwritten);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptParameterInfo model) {
            if (model.wasPropertyExplicitlySet("scriptParameter")) {
                this.scriptParameter(model.getScriptParameter());
            }
            if (model.wasPropertyExplicitlySet("isOverwritten")) {
                this.isOverwritten(model.getIsOverwritten());
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

    @com.fasterxml.jackson.annotation.JsonProperty("scriptParameter")
    private final ScriptParameter scriptParameter;

    public ScriptParameter getScriptParameter() {
        return scriptParameter;
    }

    /** If parameter value is default or overwritten. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverwritten")
    private final Boolean isOverwritten;

    /**
     * If parameter value is default or overwritten.
     *
     * @return the value
     */
    public Boolean getIsOverwritten() {
        return isOverwritten;
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
        sb.append("ScriptParameterInfo(");
        sb.append("super=").append(super.toString());
        sb.append("scriptParameter=").append(String.valueOf(this.scriptParameter));
        sb.append(", isOverwritten=").append(String.valueOf(this.isOverwritten));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptParameterInfo)) {
            return false;
        }

        ScriptParameterInfo other = (ScriptParameterInfo) o;
        return java.util.Objects.equals(this.scriptParameter, other.scriptParameter)
                && java.util.Objects.equals(this.isOverwritten, other.isOverwritten)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.scriptParameter == null ? 43 : this.scriptParameter.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverwritten == null ? 43 : this.isOverwritten.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
