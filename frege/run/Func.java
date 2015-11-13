package frege.run;

public class Func  {
  public interface U<𝓐, 𝓑> extends Kind.U<U<𝓐, ?>, 𝓑>, Kind.B<U<?, ?>, 𝓐, 𝓑> {
    public frege.run.Lazy<𝓑> apply(final frege.run.Lazy<𝓐> a) ;
  }
  public interface B<𝓐, 𝓑, 𝓒> 
    extends Kind.U<B<𝓐, 𝓑, ?>, 𝓒>, Kind.B<B<𝓐, ?, ?>, 𝓑, 𝓒>,
    Kind.T<B<?, ?, ?>, 𝓐, 𝓑, 𝓒>
   {
    public frege.run.Lazy<𝓒> apply(final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b) ;
  }
  public interface T<𝓐, 𝓑, 𝓒, 𝓓> 
    extends Kind.U<T<𝓐, 𝓑, 𝓒, ?>, 𝓓>, Kind.B<T<𝓐, 𝓑, ?, ?>, 𝓒, 𝓓>,
    Kind.T<T<𝓐, ?, ?, ?>, 𝓑, 𝓒, 𝓓>, Kind.Q<T<?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓>
   {
    public frege.run.Lazy<𝓓> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c
    ) ;
  }
  public interface Q<𝓐, 𝓑, 𝓒, 𝓓, 𝓔> 
    extends Kind.U<Q<𝓐, 𝓑, 𝓒, 𝓓, ?>, 𝓔>, Kind.B<Q<𝓐, 𝓑, 𝓒, ?, ?>, 𝓓, 𝓔>,
    Kind.T<Q<𝓐, 𝓑, ?, ?, ?>, 𝓒, 𝓓, 𝓔>, Kind.Q<Q<𝓐, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔>,
    Kind.V<Q<?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔>
   {
    public frege.run.Lazy<𝓔> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d
    ) ;
  }
  public interface V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕> 
    extends Kind.U<V<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?>, 𝓕>, Kind.B<V<𝓐, 𝓑, 𝓒, 𝓓, ?, ?>, 𝓔, 𝓕>,
    Kind.T<V<𝓐, 𝓑, 𝓒, ?, ?, ?>, 𝓓, 𝓔, 𝓕>, Kind.Q<V<𝓐, 𝓑, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕>,
    Kind.V<V<𝓐, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>,
    Kind.VI<V<?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕>
   {
    public frege.run.Lazy<𝓕> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e
    ) ;
  }
  public interface VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖> 
    extends Kind.U<VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?>, 𝓖>,
    Kind.B<VI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?>, 𝓕, 𝓖>,
    Kind.T<VI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?>, 𝓔, 𝓕, 𝓖>,
    Kind.Q<VI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖>,
    Kind.V<VI<𝓐, 𝓑, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>,
    Kind.VI<VI<𝓐, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>,
    Kind.VII<VI<?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖>
   {
    public frege.run.Lazy<𝓖> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f
    ) ;
  }
  public interface VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗> 
    extends Kind.U<VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?>, 𝓗>,
    Kind.B<VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?>, 𝓖, 𝓗>,
    Kind.T<VII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?>, 𝓕, 𝓖, 𝓗>,
    Kind.Q<VII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗>,
    Kind.V<VII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
    Kind.VI<VII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
    Kind.VII<VII<𝓐, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>,
    Kind.VIII<VII<?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗>
   {
    public frege.run.Lazy<𝓗> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g
    ) ;
  }
  public interface VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘> 
    extends Kind.U<VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?>, 𝓘>,
    Kind.B<VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?>, 𝓗, 𝓘>,
    Kind.T<VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?>, 𝓖, 𝓗, 𝓘>,
    Kind.Q<VIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘>,
    Kind.V<VIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
    Kind.VI<VIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
    Kind.VII<VIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
    Kind.VIII<VIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>,
    Kind.IX<VIII<?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘>
   {
    public frege.run.Lazy<𝓘> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h
    ) ;
  }
  public interface IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙> 
    extends Kind.U<IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?>, 𝓙>,
    Kind.B<IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?>, 𝓘, 𝓙>,
    Kind.T<IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?>, 𝓗, 𝓘, 𝓙>,
    Kind.Q<IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.V<IX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.VI<IX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.VII<IX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.VIII<IX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.IX<IX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>,
    Kind.X<IX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙>
   {
    public frege.run.Lazy<𝓙> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i
    ) ;
  }
  public interface X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚> 
    extends Kind.U<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?>, 𝓚>,
    Kind.B<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?>, 𝓙, 𝓚>,
    Kind.T<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?>, 𝓘, 𝓙, 𝓚>,
    Kind.Q<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.V<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.VI<X<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.VII<X<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.VIII<X<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.IX<X<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.X<X<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>,
    Kind.XI<X<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚>
   {
    public frege.run.Lazy<𝓚> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j
    ) ;
  }
  public interface XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛> 
    extends Kind.U<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?>, 𝓛>,
    Kind.B<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?>, 𝓚, 𝓛>,
    Kind.T<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?>, 𝓙, 𝓚, 𝓛>,
    Kind.Q<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.V<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.VI<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.VII<XI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.VIII<XI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.IX<XI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.X<XI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛>,
    Kind.XI<
      XI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    >,
    Kind.XII<
      XI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛
    >
   {
    public frege.run.Lazy<𝓛> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k
    ) ;
  }
  public interface XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜> 
    extends Kind.U<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?>, 𝓜>,
    Kind.B<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?>, 𝓛, 𝓜>,
    Kind.T<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?>, 𝓚, 𝓛, 𝓜>,
    Kind.Q<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.V<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.VI<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.VII<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.VIII<XII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.IX<XII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜>,
    Kind.X<
      XII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    >,
    Kind.XI<
      XII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜
    >,
    Kind.XII<
      XII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜
    >,
    Kind.XIII<
      XII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜
    >
   {
    public frege.run.Lazy<𝓜> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l
    ) ;
  }
  public interface XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝> 
    extends Kind.U<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?>, 𝓝>,
    Kind.B<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?>, 𝓜, 𝓝>,
    Kind.T<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?>, 𝓛, 𝓜, 𝓝>,
    Kind.Q<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝>,
    Kind.V<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>,
    Kind.VI<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>,
    Kind.VII<XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝>,
    Kind.VIII<
      XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    >,
    Kind.IX<
      XIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    >,
    Kind.X<
      XIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝
    >,
    Kind.XI<
      XIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜,
      𝓝
    >,
    Kind.XII<
      XIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜, 𝓝
    >,
    Kind.XIII<
      XIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝
    >,
    Kind.XIV<
      XIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝
    >
   {
    public frege.run.Lazy<𝓝> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m
    ) ;
  }
  public interface XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞> 
    extends Kind.U<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?>, 𝓞>,
    Kind.B<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?>, 𝓝, 𝓞>,
    Kind.T<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?>, 𝓜, 𝓝, 𝓞>,
    Kind.Q<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞>,
    Kind.V<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>,
    Kind.VI<XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞>,
    Kind.VII<
      XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    >,
    Kind.VIII<
      XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    >,
    Kind.IX<
      XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    >,
    Kind.X<
      XIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝,
      𝓞
    >,
    Kind.XI<
      XIV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜,
      𝓝, 𝓞
    >,
    Kind.XII<
      XIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜, 𝓝, 𝓞
    >,
    Kind.XIII<
      XIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞
    >,
    Kind.XIV<
      XIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞
    >,
    Kind.XV<
      XIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞
    >
   {
    public frege.run.Lazy<𝓞> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n
    ) ;
  }
  public interface XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟> 
    extends Kind.U<XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?>, 𝓟>,
    Kind.B<XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?>, 𝓞, 𝓟>,
    Kind.T<XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?>, 𝓝, 𝓞, 𝓟>,
    Kind.Q<XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟>,
    Kind.V<XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟>,
    Kind.VI<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.VII<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.VIII<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.IX<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
      𝓟
    >,
    Kind.X<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝,
      𝓞, 𝓟
    >,
    Kind.XI<
      XV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜,
      𝓝, 𝓞, 𝓟
    >,
    Kind.XII<
      XV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.XIII<
      XV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.XIV<
      XV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.XV<
      XV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >,
    Kind.XVI<
      XV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟
    >
   {
    public frege.run.Lazy<𝓟> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o
    ) ;
  }
  public interface XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠> 
    extends Kind.U<XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?>, 𝓠>,
    Kind.B<XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?>, 𝓟, 𝓠>,
    Kind.T<XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?>, 𝓞, 𝓟, 𝓠>,
    Kind.Q<XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠>,
    Kind.V<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.VI<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.VII<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟,
      𝓠
    >,
    Kind.VIII<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞,
      𝓟, 𝓠
    >,
    Kind.IX<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝,
      𝓞, 𝓟, 𝓠
    >,
    Kind.X<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝,
      𝓞, 𝓟, 𝓠
    >,
    Kind.XI<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜,
      𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XII<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛,
      𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XIII<
      XVI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XIV<
      XVI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚,
      𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XV<
      XVI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙,
      𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XVI<
      XVI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘,
      𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >,
    Kind.XVII<
      XVI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗,
      𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠
    >
   {
    public frege.run.Lazy<𝓠> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c,
      final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i,
      final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o,
      final frege.run.Lazy<𝓟> p
    ) ;
  }
  public interface XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡> 
    extends Kind.U<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?>, 𝓡>, Kind.B<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?>, 𝓠, 𝓡>,
    Kind.T<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?>, 𝓟, 𝓠, 𝓡>,
    Kind.Q<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.V<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.VI<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.VII<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.VIII<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.IX<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.X<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XI<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XII<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XIII<XVII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XIV<XVII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XV<XVII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XVI<XVII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XVII<XVII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>,
    Kind.XVIII<XVII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡>
   {
    public frege.run.Lazy<𝓡> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q
    ) ;
  }
  public interface XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢> 
    extends Kind.U<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?>, 𝓢>,
    Kind.B<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?>, 𝓡, 𝓢>,
    Kind.T<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?>, 𝓠, 𝓡, 𝓢>,
    Kind.Q<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.V<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.VI<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.VII<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.VIII<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.IX<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.X<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XI<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XII<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XIII<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XIV<XVIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XV<XVIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XVI<XVIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XVII<XVIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XVIII<XVIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>,
    Kind.XIX<XVIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢>
   {
    public frege.run.Lazy<𝓢> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r
    ) ;
  }
  public interface XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣> 
    extends Kind.U<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?>, 𝓣>,
    Kind.B<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?>, 𝓢, 𝓣>,
    Kind.T<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?>, 𝓡, 𝓢, 𝓣>,
    Kind.Q<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.V<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.VI<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.VII<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.VIII<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.IX<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.X<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XI<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XII<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XIII<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XIV<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XV<XIX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XVI<XIX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XVII<XIX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XVIII<XIX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XIX<XIX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>,
    Kind.XX<XIX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣>
   {
    public frege.run.Lazy<𝓣> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s
    ) ;
  }
  public interface XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤> 
    extends Kind.U<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?>, 𝓤>,
    Kind.B<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?>, 𝓣, 𝓤>,
    Kind.T<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?>, 𝓢, 𝓣, 𝓤>,
    Kind.Q<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.V<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.VI<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.VII<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.VIII<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.IX<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.X<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XI<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XII<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XIII<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XIV<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XV<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XVI<XX<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XVII<XX<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XVIII<XX<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XIX<XX<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XX<XX<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>,
    Kind.XXI<XX<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤>
   {
    public frege.run.Lazy<𝓤> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t
    ) ;
  }
  public interface XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥> 
    extends Kind.U<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?>, 𝓥>,
    Kind.B<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?>, 𝓤, 𝓥>,
    Kind.T<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?>, 𝓣, 𝓤, 𝓥>,
    Kind.Q<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?, ?>, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.V<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.VI<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.VII<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.VIII<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.IX<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.X<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XI<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XII<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XIII<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XIV<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XV<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XVI<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XVII<XXI<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XVIII<XXI<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XIX<XXI<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XX<XXI<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XXI<XXI<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>,
    Kind.XXII<XXI<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥>
   {
    public frege.run.Lazy<𝓥> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t, final frege.run.Lazy<𝓤> u
    ) ;
  }
  public interface XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦> 
    extends Kind.U<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?>, 𝓦>,
    Kind.B<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?>, 𝓥, 𝓦>,
    Kind.T<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?>, 𝓤, 𝓥, 𝓦>,
    Kind.Q<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?>, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.V<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?>, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.VI<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.VII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.VIII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.IX<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.X<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XI<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XIII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XIV<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XV<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XVI<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XVII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XVIII<XXII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XIX<XXII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XX<XXII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XXI<XXII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XXII<XXII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>,
    Kind.XXIII<XXII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦>
   {
    public frege.run.Lazy<𝓦> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t, final frege.run.Lazy<𝓤> u, final frege.run.Lazy<𝓥> v
    ) ;
  }
  public interface XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧> 
    extends Kind.U<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?>, 𝓧>,
    Kind.B<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?>, 𝓦, 𝓧>,
    Kind.T<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?>, 𝓥, 𝓦, 𝓧>,
    Kind.Q<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?>, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.V<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?>, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.VI<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?>, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.VII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.VIII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.IX<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.X<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XI<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XIII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XIV<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XV<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XVI<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XVII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XVIII<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XIX<XXIII<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XX<XXIII<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XXI<XXIII<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XXII<XXIII<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XXIII<XXIII<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>,
    Kind.XXIV<XXIII<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧>
   {
    public frege.run.Lazy<𝓧> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t, final frege.run.Lazy<𝓤> u, final frege.run.Lazy<𝓥> v, final frege.run.Lazy<𝓦> w
    ) ;
  }
  public interface XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨> 
    extends Kind.U<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?>, 𝓨>,
    Kind.B<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?>, 𝓧, 𝓨>,
    Kind.T<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?>, 𝓦, 𝓧, 𝓨>,
    Kind.Q<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?>, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.V<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?>, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.VI<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?>, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.VII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?>, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.VIII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.IX<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.X<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XI<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XIII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XIV<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XV<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XVI<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XVII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XVIII<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XIX<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XX<XXIV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XXI<XXIV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XXII<XXIV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XXIII<XXIV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XXIV<XXIV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨>,
    Kind.XXV<
      XXIV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨
    >
   {
    public frege.run.Lazy<𝓨> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t, final frege.run.Lazy<𝓤> u, final frege.run.Lazy<𝓥> v, final frege.run.Lazy<𝓦> w, final frege.run.Lazy<𝓧> x
    ) ;
  }
  public interface XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩> 
    extends Kind.U<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, ?>, 𝓩>,
    Kind.B<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, ?, ?>, 𝓨, 𝓩>,
    Kind.T<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, ?, ?, ?>, 𝓧, 𝓨, 𝓩>,
    Kind.Q<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, ?, ?, ?, ?>, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.V<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, ?, ?, ?, ?, ?>, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.VI<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, ?, ?, ?, ?, ?, ?>, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.VII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, ?, ?, ?, ?, ?, ?, ?>, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.VIII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.IX<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.X<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XI<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XIII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XIV<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XV<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XVI<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XVII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XVIII<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XIX<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XX<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XXI<XXV<𝓐, 𝓑, 𝓒, 𝓓, 𝓔, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XXII<XXV<𝓐, 𝓑, 𝓒, 𝓓, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩>,
    Kind.XXIII<
      XXV<𝓐, 𝓑, 𝓒, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    >,
    Kind.XXIV<
      XXV<𝓐, 𝓑, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    >,
    Kind.XXV<
      XXV<𝓐, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    >,
    Kind.XXVI<
      XXV<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?>, 𝓐, 𝓑, 𝓒, 𝓓, 𝓔, 𝓕, 𝓖, 𝓗, 𝓘, 𝓙, 𝓚, 𝓛, 𝓜, 𝓝, 𝓞, 𝓟, 𝓠, 𝓡, 𝓢, 𝓣, 𝓤, 𝓥, 𝓦, 𝓧, 𝓨, 𝓩
    >
   {
    public frege.run.Lazy<𝓩> apply(
      final frege.run.Lazy<𝓐> a, final frege.run.Lazy<𝓑> b, final frege.run.Lazy<𝓒> c, final frege.run.Lazy<𝓓> d, final frege.run.Lazy<𝓔> e, final frege.run.Lazy<𝓕> f,
      final frege.run.Lazy<𝓖> g, final frege.run.Lazy<𝓗> h, final frege.run.Lazy<𝓘> i, final frege.run.Lazy<𝓙> j, final frege.run.Lazy<𝓚> k, final frege.run.Lazy<𝓛> l,
      final frege.run.Lazy<𝓜> m, final frege.run.Lazy<𝓝> n, final frege.run.Lazy<𝓞> o, final frege.run.Lazy<𝓟> p, final frege.run.Lazy<𝓠> q, final frege.run.Lazy<𝓡> r,
      final frege.run.Lazy<𝓢> s, final frege.run.Lazy<𝓣> t, final frege.run.Lazy<𝓤> u, final frege.run.Lazy<𝓥> v, final frege.run.Lazy<𝓦> w, final frege.run.Lazy<𝓧> x,
      final frege.run.Lazy<𝓨> y
    ) ;
  }
}
