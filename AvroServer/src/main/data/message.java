/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package main.data;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class message extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4817994292548549034L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"message\",\"namespace\":\"main.data\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"content\",\"type\":\"string\"},{\"name\":\"timestmp\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence content;
  @Deprecated public long timestmp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public message() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param content The new value for content
   * @param timestmp The new value for timestmp
   */
  public message(java.lang.CharSequence name, java.lang.CharSequence content, java.lang.Long timestmp) {
    this.name = name;
    this.content = content;
    this.timestmp = timestmp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return content;
    case 2: return timestmp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: content = (java.lang.CharSequence)value$; break;
    case 2: timestmp = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'content' field.
   * @return The value of the 'content' field.
   */
  public java.lang.CharSequence getContent() {
    return content;
  }

  /**
   * Sets the value of the 'content' field.
   * @param value the value to set.
   */
  public void setContent(java.lang.CharSequence value) {
    this.content = value;
  }

  /**
   * Gets the value of the 'timestmp' field.
   * @return The value of the 'timestmp' field.
   */
  public java.lang.Long getTimestmp() {
    return timestmp;
  }

  /**
   * Sets the value of the 'timestmp' field.
   * @param value the value to set.
   */
  public void setTimestmp(java.lang.Long value) {
    this.timestmp = value;
  }

  /**
   * Creates a new message RecordBuilder.
   * @return A new message RecordBuilder
   */
  public static main.data.message.Builder newBuilder() {
    return new main.data.message.Builder();
  }

  /**
   * Creates a new message RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new message RecordBuilder
   */
  public static main.data.message.Builder newBuilder(main.data.message.Builder other) {
    return new main.data.message.Builder(other);
  }

  /**
   * Creates a new message RecordBuilder by copying an existing message instance.
   * @param other The existing instance to copy.
   * @return A new message RecordBuilder
   */
  public static main.data.message.Builder newBuilder(main.data.message other) {
    return new main.data.message.Builder(other);
  }

  /**
   * RecordBuilder for message instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<message>
    implements org.apache.avro.data.RecordBuilder<message> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence content;
    private long timestmp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(main.data.message.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestmp)) {
        this.timestmp = data().deepCopy(fields()[2].schema(), other.timestmp);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing message instance
     * @param other The existing instance to copy.
     */
    private Builder(main.data.message other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.content)) {
        this.content = data().deepCopy(fields()[1].schema(), other.content);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.timestmp)) {
        this.timestmp = data().deepCopy(fields()[2].schema(), other.timestmp);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }

    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public main.data.message.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public main.data.message.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'content' field.
      * @return The value.
      */
    public java.lang.CharSequence getContent() {
      return content;
    }

    /**
      * Sets the value of the 'content' field.
      * @param value The value of 'content'.
      * @return This builder.
      */
    public main.data.message.Builder setContent(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.content = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'content' field has been set.
      * @return True if the 'content' field has been set, false otherwise.
      */
    public boolean hasContent() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'content' field.
      * @return This builder.
      */
    public main.data.message.Builder clearContent() {
      content = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestmp' field.
      * @return The value.
      */
    public java.lang.Long getTimestmp() {
      return timestmp;
    }

    /**
      * Sets the value of the 'timestmp' field.
      * @param value The value of 'timestmp'.
      * @return This builder.
      */
    public main.data.message.Builder setTimestmp(long value) {
      validate(fields()[2], value);
      this.timestmp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'timestmp' field has been set.
      * @return True if the 'timestmp' field has been set, false otherwise.
      */
    public boolean hasTimestmp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'timestmp' field.
      * @return This builder.
      */
    public main.data.message.Builder clearTimestmp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public message build() {
      try {
        message record = new message();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.content = fieldSetFlags()[1] ? this.content : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.timestmp = fieldSetFlags()[2] ? this.timestmp : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
