package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Filme;

public class FilmeDao extends Dao {
	
	public void create(Filme f) throws Exception {
		open();
		stmt = con.prepareStatement("insert into filmes values(null,?,?,?,?)");
		stmt.setString(1, f.getNome());
		stmt.setString(2, f.getDescricao());
		stmt.setDouble(3, f.getPreco());
		stmt.setString(4, f.getImagem());
		stmt.execute();
		stmt.close();
	}
	
	public List<Filme> findAll() throws Exception {
		open();
		List<Filme> lista = new ArrayList<Filme>();
		stmt = con.prepareStatement("select * from filmes");
		rs = stmt.executeQuery();
		while(rs.next()) {
			Filme f = new Filme();
			f.setId(rs.getLong("id"));
			f.setNome(rs.getString("nome"));
			f.setDescricao(rs.getString("descricao"));
			f.setPreco(rs.getDouble("preco"));
			f.setImagem(rs.getString("imagem"));
			lista.add(f);
		}
		close();
		return lista;
	}

}
