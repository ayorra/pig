/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pig.data;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;

import org.apache.pig.backend.executionengine.ExecException;

/**
 * A singleton Tuple type which is not picked up for writing by PigRecordWriter
 */
public class NonWritableTuple extends AbstractTuple {


    public static final NonWritableTuple INSTANCE = new NonWritableTuple();

    private NonWritableTuple(){}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object get(int fieldNum) throws ExecException {
        return null;
    }

    @Override
    public List<Object> getAll() {
        throw new RuntimeException("Unimplemented");
    }

    @Override
    public void set(int fieldNum, Object val) throws ExecException {
        throw new ExecException("Unimplemented");
    }

    @Override
    public void append(Object val) {
        throw new RuntimeException("Unimplemented");
    }

    @Override
    public long getMemorySize() {
        throw new RuntimeException("Unimplemented");
    }

    @Override
    public void readFields(DataInput arg0) throws IOException {
        throw new IOException("Unimplemented");
    }

    @Override
    public void write(DataOutput arg0) throws IOException {
        throw new IOException("Unimplemented");
    }

    @Override
    public int compareTo(Object o) {
        throw new RuntimeException("Unimplemented");
    }

}
