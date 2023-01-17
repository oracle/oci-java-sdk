/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Stack trace element. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StackTraceElement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class StackTraceElement
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "methodName",
        "fileName",
        "lineNumber",
        "className",
        "weightage"
    })
    public StackTraceElement(
            String methodName,
            String fileName,
            Integer lineNumber,
            String className,
            Float weightage) {
        super();
        this.methodName = methodName;
        this.fileName = fileName;
        this.lineNumber = lineNumber;
        this.className = className;
        this.weightage = weightage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the method containing the execution point. */
        @com.fasterxml.jackson.annotation.JsonProperty("methodName")
        private String methodName;

        /**
         * Name of the method containing the execution point.
         *
         * @param methodName the value to set
         * @return this builder
         */
        public Builder methodName(String methodName) {
            this.methodName = methodName;
            this.__explicitlySet__.add("methodName");
            return this;
        }
        /** Name of the source file containing the execution point. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * Name of the source file containing the execution point.
         *
         * @param fileName the value to set
         * @return this builder
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }
        /** Line number of the source line containing the execution point. */
        @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
        private Integer lineNumber;

        /**
         * Line number of the source line containing the execution point.
         *
         * @param lineNumber the value to set
         * @return this builder
         */
        public Builder lineNumber(Integer lineNumber) {
            this.lineNumber = lineNumber;
            this.__explicitlySet__.add("lineNumber");
            return this;
        }
        /** Name of the class containing the execution point. */
        @com.fasterxml.jackson.annotation.JsonProperty("className")
        private String className;

        /**
         * Name of the class containing the execution point.
         *
         * @param className the value to set
         * @return this builder
         */
        public Builder className(String className) {
            this.className = className;
            this.__explicitlySet__.add("className");
            return this;
        }
        /**
         * The weight distribution that denotes the percentage occurrence of a method in the
         * captured snapshots.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("weightage")
        private Float weightage;

        /**
         * The weight distribution that denotes the percentage occurrence of a method in the
         * captured snapshots.
         *
         * @param weightage the value to set
         * @return this builder
         */
        public Builder weightage(Float weightage) {
            this.weightage = weightage;
            this.__explicitlySet__.add("weightage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackTraceElement build() {
            StackTraceElement model =
                    new StackTraceElement(
                            this.methodName,
                            this.fileName,
                            this.lineNumber,
                            this.className,
                            this.weightage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackTraceElement model) {
            if (model.wasPropertyExplicitlySet("methodName")) {
                this.methodName(model.getMethodName());
            }
            if (model.wasPropertyExplicitlySet("fileName")) {
                this.fileName(model.getFileName());
            }
            if (model.wasPropertyExplicitlySet("lineNumber")) {
                this.lineNumber(model.getLineNumber());
            }
            if (model.wasPropertyExplicitlySet("className")) {
                this.className(model.getClassName());
            }
            if (model.wasPropertyExplicitlySet("weightage")) {
                this.weightage(model.getWeightage());
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

    /** Name of the method containing the execution point. */
    @com.fasterxml.jackson.annotation.JsonProperty("methodName")
    private final String methodName;

    /**
     * Name of the method containing the execution point.
     *
     * @return the value
     */
    public String getMethodName() {
        return methodName;
    }

    /** Name of the source file containing the execution point. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * Name of the source file containing the execution point.
     *
     * @return the value
     */
    public String getFileName() {
        return fileName;
    }

    /** Line number of the source line containing the execution point. */
    @com.fasterxml.jackson.annotation.JsonProperty("lineNumber")
    private final Integer lineNumber;

    /**
     * Line number of the source line containing the execution point.
     *
     * @return the value
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /** Name of the class containing the execution point. */
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    private final String className;

    /**
     * Name of the class containing the execution point.
     *
     * @return the value
     */
    public String getClassName() {
        return className;
    }

    /**
     * The weight distribution that denotes the percentage occurrence of a method in the captured
     * snapshots.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weightage")
    private final Float weightage;

    /**
     * The weight distribution that denotes the percentage occurrence of a method in the captured
     * snapshots.
     *
     * @return the value
     */
    public Float getWeightage() {
        return weightage;
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
        sb.append("StackTraceElement(");
        sb.append("super=").append(super.toString());
        sb.append("methodName=").append(String.valueOf(this.methodName));
        sb.append(", fileName=").append(String.valueOf(this.fileName));
        sb.append(", lineNumber=").append(String.valueOf(this.lineNumber));
        sb.append(", className=").append(String.valueOf(this.className));
        sb.append(", weightage=").append(String.valueOf(this.weightage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StackTraceElement)) {
            return false;
        }

        StackTraceElement other = (StackTraceElement) o;
        return java.util.Objects.equals(this.methodName, other.methodName)
                && java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(this.lineNumber, other.lineNumber)
                && java.util.Objects.equals(this.className, other.className)
                && java.util.Objects.equals(this.weightage, other.weightage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.methodName == null ? 43 : this.methodName.hashCode());
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result = (result * PRIME) + (this.lineNumber == null ? 43 : this.lineNumber.hashCode());
        result = (result * PRIME) + (this.className == null ? 43 : this.className.hashCode());
        result = (result * PRIME) + (this.weightage == null ? 43 : this.weightage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
