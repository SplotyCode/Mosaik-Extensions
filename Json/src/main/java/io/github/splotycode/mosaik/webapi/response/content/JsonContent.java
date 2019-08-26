package io.github.splotycode.mosaik.webapi.response.content;

import io.github.splotycode.mosaik.util.io.IOUtil;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

@AllArgsConstructor
@NoArgsConstructor
public class JsonContent implements ResponseContent {

    @Getter @Setter
    private JSONObject object = new JSONObject();

    @Override
    public String getContentType() throws IOException {
        return "application/json";
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return IOUtil.toInputStream(object.toString());
    }
}
