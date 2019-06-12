package models;

import textures.ModelTexture;

public class TexturedModel extends RawModel {
	
	private ModelTexture texture;

	public TexturedModel(int vaoID, int vertexCount, ModelTexture texture) {
		super(vaoID, vertexCount);
		this.texture = texture;
	}
	
	public TexturedModel(RawModel model, ModelTexture texture) {
		super(model.getVaoID(), model.getVertexCount());
		this.texture = texture;
	}

	public ModelTexture getTexture() {
		return texture;
	}

}
