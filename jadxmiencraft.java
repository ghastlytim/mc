package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.minecraft.BanDetails;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.ProfileActionType;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.ServicesKeyType;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.blaze3d.platform.GlConst;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixer;
import com.mojang.jtracy.DiscontinuousFrame;
import com.mojang.jtracy.TracyClient;
import com.mojang.logging.LogUtils;
import defpackage.af;
import defpackage.ahm;
import defpackage.bot;
import defpackage.bsl;
import defpackage.evg;
import defpackage.faz;
import defpackage.ffo;
import defpackage.fla;
import defpackage.flr;
import defpackage.flw;
import defpackage.frd;
import defpackage.frg;
import defpackage.fuk;
import defpackage.gam;
import defpackage.glf;
import defpackage.wn;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.management.ManagementFactory;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.net.Proxy;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.io.FileUtils;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;

/* loaded from: 1.21.4.jar:flk.class */
public class flk extends bre<Runnable> implements fez {
    static flk F;
    private static final Logger G = LogUtils.getLogger();
    public static final boolean a;
    private static final int H = 10;
    public static final akv b;
    public static final akv c;
    public static final akv d;
    private static final akv I;
    private static final CompletableFuture<baf> J;
    private static final wp K;
    public static final String e = "Please make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).";
    private final long L;
    private final Path M;
    private final CompletableFuture<ProfileResult> N;
    private final hev O;
    private final gmq P;
    private final DataFixer Q;
    private final gmz R;
    private final fey S;
    private final fla.b T;
    private final gmh U;
    public final glv f;
    private final gsd V;
    private final hbn W;
    private final gtd X;
    private final gly Y;
    public final gjk g;
    private final flw Z;
    public final fod h;
    public final fod i;
    public final glq j;
    public final gqa l;
    private final AtomicReference<arr> aa;
    public final foe m;
    public final flo n;
    private final flf ab;
    public final fll o;
    public final flj p;
    private flh ac;
    public final File q;
    private final String ad;
    private final String ae;
    private final Proxy af;
    private final evg ag;
    private final boolean ah;
    private final boolean ai;
    private final boolean aj;
    private final aum ak;
    private final atg al;
    private final hhs am;
    private final aua an;
    private final hgd ao;
    private final fmm ap;
    private final fef aq;

    @Nullable
    private final fdg ar;
    private final hjw as;
    private final hjr at;
    private final frk au;
    private final hfx av;
    private final glr aw;
    private final flp ax;
    private final YggdrasilAuthenticationService ay;
    private final MinecraftSessionService az;
    private final UserApiService aA;
    private final CompletableFuture<UserApiService.UserProperties> aB;
    private final hfw aC;
    private final hhh aD;
    private final gnd aE;
    private final hfu aF;
    private final hft aG;
    private final hfs aH;
    private final hfr aI;
    private final fog aJ;
    private final frf aK;
    private final hky aL;
    private final fzc aM;
    private final gok aN;
    private final hka aO;
    private final ggn aP;
    private final fik aQ;
    private final glf aR;

    @Nullable
    public ggk r;

    @Nullable
    public gga s;

    @Nullable
    public gkx t;

    @Nullable
    private hje aS;

    @Nullable
    private vi aT;
    private boolean aU;

    @Nullable
    public bum u;

    @Nullable
    public bum v;

    @Nullable
    public faz w;
    private int aV;
    protected int x;
    private volatile boolean aW;
    private long aX;
    private long aY;
    private int aZ;
    public boolean y;

    @Nullable
    public fum z;

    @Nullable
    private fug ba;
    private boolean bb;
    Thread bc;
    private volatile boolean bd;

    @Nullable
    private Supplier<o> be;
    private static int bf;
    public String A;
    private long bg;
    private final fem bh;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    private boolean bi;
    private final Queue<Runnable> bj;

    @Nullable
    private CompletableFuture<Void> bk;

    @Nullable
    private frg bl;
    private int bm;
    private final bon bn;
    private bql bo;
    private final flr bp;
    private long bq;
    private double br;

    @Nullable
    private ffo.a bs;
    private final flb bt;
    private final ggu bu;
    private ghj bv;
    private final fkx bw;
    private final far bx;
    private boolean by;
    private final long bz;
    private long bA;

    static {
        a = af.n() == af.a.OSX;
        b = akv.b("default");
        c = akv.b("uniform");
        d = akv.b("alt");
        I = akv.b("regional_compliancies.json");
        J = CompletableFuture.completedFuture(baf.INSTANCE);
        K = wp.c("multiplayer.socialInteractions.not_available");
    }

    public flk(final gam $$0) {
        super("Client");
        fel $$6;
        this.L = Double.doubleToLongBits(3.141592653589793d);
        this.T = new fla.b(20.0f, 0L, this::a);
        this.aa = new AtomicReference<>();
        this.ac = flh.NONE;
        this.ax = new flp(I, flk::a);
        this.aX = af.d();
        this.A = "";
        this.E = true;
        this.bj = Queues.newConcurrentLinkedQueue();
        this.bn = new bon(af.c, () -> {
            return this.bm;
        });
        this.bo = bqk.a;
        this.bp = new flr();
        F = this;
        this.bz = System.currentTimeMillis();
        this.q = $$0.c.a;
        File $$1 = $$0.c.c;
        this.M = $$0.c.b.toPath();
        this.ad = $$0.d.b;
        this.ae = $$0.d.c;
        Path $$2 = this.q.toPath();
        this.bx = evg.a($$2.resolve(evg.b));
        hfl $$3 = new hfl($$0.c.a(), this.bx);
        this.am = new hhs(this, $$2.resolve("downloads"), $$0.a);
        auc $$4 = new atv(this.M, ate.CLIENT_RESOURCES, aub.b, this.bx);
        this.an = new aua($$3, this.am.a(), $$4);
        this.al = $$3.a();
        this.af = $$0.a.d;
        this.ay = new YggdrasilAuthenticationService(this.af);
        this.az = this.ay.createMinecraftSessionService();
        this.Z = $$0.a.a;
        this.N = CompletableFuture.supplyAsync(() -> {
            return this.az.fetchProfile(this.Z.b(), true);
        }, af.j());
        this.aA = a(this.ay, $$0);
        this.aB = CompletableFuture.supplyAsync(() -> {
            try {
                return this.aA.fetchProperties();
            } catch (AuthenticationException $$02) {
                G.error("Failed to fetch user properties", $$02);
                return UserApiService.OFFLINE_PROPERTIES;
            }
        }, af.j());
        G.info("Setting user: {}", this.Z.c());
        G.debug("(Session ID is {})", this.Z.a());
        this.ah = $$0.d.a;
        this.ai = !$$0.d.d;
        this.aj = !$$0.d.e;
        this.aS = null;
        xu.a((Function<String, Supplier<wp>>) fli::a);
        this.Q = bao.a();
        this.aK = new frf(this);
        this.bc = Thread.currentThread();
        this.n = new flo(this, this.q);
        RenderSystem.setShaderGlintAlpha(this.n.aq().c().doubleValue());
        this.bd = true;
        this.aL = new hky(this, this.n);
        this.ab = new flf($$2, this.Q);
        G.info("Backend library: {}", RenderSystem.getBackendDescription());
        if (this.n.p > 0 && this.n.o > 0) {
            $$6 = new fel(this.n.o, this.n.p, $$0.b.c, $$0.b.d, $$0.b.e);
        } else {
            $$6 = $$0.b;
        }
        af.c = RenderSystem.initBackendSystem();
        this.R = new gmz(this);
        this.S = this.R.a($$6, this.n.k, bh());
        a(true);
        this.S.a(new Runnable() { // from class: flk.1
            private boolean c;

            @Override // java.lang.Runnable
            public void run() {
                if (!this.c) {
                    this.c = true;
                    fei.a($$0.c.a, flk.this.bc.threadId());
                }
            }
        });
        hkl.a.b(hkh.A);
        try {
            this.S.a(this.al, ab.b().g() ? fep.RELEASE : fep.SNAPSHOT);
        } catch (IOException $$7) {
            G.error("Couldn't set icon", $$7);
        }
        this.o = new fll(this);
        this.o.a(this.S.h());
        this.p = new flj(this);
        this.p.a(this.S.h());
        RenderSystem.initRenderer(this.n.t, false);
        this.aq = new fed(this.S.k(), this.S.l());
        this.aq.a(0.0f, 0.0f, 0.0f, 0.0f);
        this.aq.f();
        this.ak = new aum(ate.CLIENT_RESOURCES);
        this.an.a();
        this.n.b(this.an);
        this.ao = new hgd(this.n.ab, $$02 -> {
            if (this.t != null) {
                this.t.j.C();
            }
        });
        this.ak.a(this.ao);
        this.O = new hev(this.ak);
        this.ak.a(this.O);
        this.P = new gmq(this.O, this::a);
        this.ak.a(this.P);
        this.aC = new hfw($$1.toPath().resolve("skins"), this.az, this);
        this.ag = new evg($$2.resolve("saves"), $$2.resolve("backups"), this.bx, this.Q);
        this.bw = new fkx($$2);
        this.as = new hjw(this.n);
        this.ak.a(this.as);
        this.av = new hfx(this.Z);
        this.ak.a(this.av);
        this.at = new hjr(this);
        this.au = new frk(this.O);
        this.h = this.au.a();
        this.i = this.au.b();
        this.ak.a(this.au);
        g();
        this.ak.a(new hfo());
        this.ak.a(new hfn());
        this.S.a("Startup");
        RenderSystem.setupDefaultState(0, 0, this.S.k(), this.S.l());
        this.S.a("Post startup");
        this.ap = fmm.a();
        this.aD = new hhh(this.O, this.ap, this.n.E().c().intValue());
        this.ak.a(this.aD);
        hgy $$8 = new hgy();
        this.ak.a($$8);
        this.W = new hbn(this.aD);
        this.X = new gtd(this.W);
        this.aH = new hfs(this.O);
        this.aI = new hfr(this.O);
        this.ak.a(this.aI);
        this.Y = new gly(this.aI, this.aH);
        try {
            int $$9 = Runtime.getRuntime().availableProcessors();
            ffx.a();
            this.U = new gmh($$9);
            this.aM = new fzc(this, this.aA);
            this.aE = new gnd(this.aD.b(), this.aD.d(), this.ap);
            this.ak.a(this.aE);
            this.V = new gsd(this, this.O, this.W, this.X, this.Y, this.aE, this.h, this.n, this.aD.e(), $$8);
            this.ak.a(this.V);
            this.aN = new gok(this.h, this.aD.e(), this.aE, this.W, this.X, this.V);
            this.ak.a(this.aN);
            this.g = new gjk(this.s, this.O);
            this.ak.a(this.g);
            this.aF = new hfu(this.O);
            this.ak.a(this.aF);
            this.aG = new hft(this.O);
            this.ak.a(this.aG);
            this.aJ = new fog(this.O);
            this.ak.a(this.aJ);
            this.j = new glq(this, this.V.d(), this.ak, this.U);
            this.f = new glv(this, this.V, this.aN, this.U);
            this.ak.a(this.f);
            this.ak.a(this.f.z());
            this.aw = new glr();
            this.ak.a(this.aw);
            this.ak.a(this.ax);
            this.m = new foe(this);
            this.l = new gqa(this);
            fgl $$11 = fgl.a(this);
            this.aQ = new fik($$11);
            RenderSystem.setErrorCallback(this::a);
            if (this.aq.c != this.S.k() || this.aq.d != this.S.l()) {
                StringBuilder $$12 = new StringBuilder("Recovering from unsupported resolution (" + this.S.k() + "x" + this.S.l() + ").\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions).");
                if (fen.b()) {
                    $$12.append("\n\nReported GL debug messages:\n").append(String.join(axx.d, fen.a()));
                }
                this.S.a(this.aq.c, this.aq.d);
                TinyFileDialogs.tinyfd_messageBox(bpb.a, $$12.toString(), "ok", "error", false);
            } else if (this.n.ad().c().booleanValue() && !this.S.i()) {
                this.S.g();
                this.n.ad().a((fln<Boolean>) Boolean.valueOf(this.S.i()));
            }
            this.S.a(this.n.Q().c().booleanValue());
            this.S.b(this.n.I().c().booleanValue());
            this.S.d();
            a();
            this.j.a(this.al.d());
            this.aO = new hka(this, this.aA, this.Z);
            this.aP = ggn.a(this.aA, this.Z, $$2);
            this.bt = new flb(this);
            this.bt.a(this.n.av().c() != flm.OFF);
            this.bu = new ggu(this);
            this.bu.a(this.n.C().c().doubleValue());
            this.bv = ghj.a(ghg.a(), this.aA);
            fuo.a(this.O);
            fuc.a(this.O);
            a((fum) new ftx(wp.c("gui.loadingMinecraft")));
            List<atc> $$13 = this.an.h();
            this.bp.a(flr.b.INITIAL, $$13);
            aul $$14 = this.ak.a(af.h().a("resourceLoad"), this, J, $$13);
            hkl.a.a(hkh.C);
            b $$15 = new b($$11, $$0.e);
            a((fug) new fuc(this, $$14, $$16 -> {
                af.a($$16, $$16 -> {
                    a($$16, $$15);
                }, () -> {
                    if (ab.aU) {
                        bk();
                    }
                    this.bp.a();
                    a($$15);
                });
            }, false));
            this.aR = glf.a($$0.e.b());
            this.bh = new fem(this.n, this);
            if (TracyClient.isAvailable() && $$0.d.f) {
                this.ar = new fdg();
            } else {
                this.ar = null;
            }
        } catch (OutOfMemoryError $$10) {
            TinyFileDialogs.tinyfd_messageBox(bpb.a, "Oh no! The game was unable to allocate memory off-heap while trying to start. You may try to free some memory by closing other applications on your computer, check that your system meets the minimum requirements, and try again. If the problem persists, please visit: " + String.valueOf(axv.k), "ok", "error", true);
            throw new gan("Unable to allocate render buffers", $$10);
        }
    }

    private void a(@Nullable b $$0) {
        if (!this.by) {
            this.by = true;
            b($$0);
        }
    }

    private void b(@Nullable b $$0) {
        Runnable $$1 = c($$0);
        hkl.a.b(hkh.C);
        hkl.a.b(hkh.z);
        hkl.a.a(this.aO.a());
        $$1.run();
    }

    public boolean c() {
        return this.by;
    }

    private Runnable c(@Nullable b $$0) {
        List<Function<Runnable, fum>> $$1 = new ArrayList<>();
        a($$1);
        Runnable $$2 = () -> {
            if ($$0 != null && $$0.b().a()) {
                gle.a(this, $$0.b(), $$0.a());
            } else {
                a((fum) new fuo(true));
            }
        };
        for (Function<Runnable, fum> $$3 : Lists.reverse($$1)) {
            fum $$4 = $$3.apply($$2);
            $$2 = () -> {
                a($$4);
            };
        }
        return $$2;
    }

    private void a(List<Function<Runnable, fum>> $$0) {
        if (this.n.ac) {
            $$0.add($$02 -> {
                return new fte(this.n, $$02);
            });
        }
        BanDetails $$1 = H();
        if ($$1 != null) {
            $$0.add($$12 -> {
                return fth.a($$12 -> {
                    if ($$12) {
                        af.n().a(axv.n);
                    }
                    $$12.run();
                }, $$1);
            });
        }
        ProfileResult $$2 = this.N.join();
        if ($$2 != null) {
            GameProfile $$3 = $$2.profile();
            Set<ProfileActionType> $$4 = $$2.actions();
            if ($$4.contains(ProfileActionType.FORCED_NAME_CHANGE)) {
                $$0.add($$13 -> {
                    return fth.a($$3.getName(), $$13);
                });
            }
            if ($$4.contains(ProfileActionType.USING_BANNED_SKIN)) {
                $$0.add(fth::a);
            }
        }
    }

    private static boolean a(Object $$0) {
        try {
            return Locale.getDefault().getISO3Country().equals($$0);
        } catch (MissingResourceException e2) {
            return false;
        }
    }

    public void d() {
        this.S.b(bh());
    }

    private String bh() {
        StringBuilder $$0 = new StringBuilder(bpb.a);
        if (e().a()) {
            $$0.append(fcf.cA);
        }
        $$0.append(" ");
        $$0.append(ab.b().c());
        ggb $$1 = L();
        if ($$1 != null && $$1.k().i()) {
            $$0.append(" - ");
            ggp $$2 = S();
            if (this.aS != null && !this.aS.r()) {
                $$0.append(hgb.a("title.singleplayer", new Object[0]));
            } else if ($$2 != null && $$2.e()) {
                $$0.append(hgb.a("title.multiplayer.realms", new Object[0]));
            } else if (this.aS != null || ($$2 != null && $$2.d())) {
                $$0.append(hgb.a("title.multiplayer.lan", new Object[0]));
            } else {
                $$0.append(hgb.a("title.multiplayer.other", new Object[0]));
            }
        }
        return $$0.toString();
    }

    private UserApiService a(YggdrasilAuthenticationService $$0, gam $$1) {
        if ($$1.a.a.g() != flw.a.MSA) {
            return UserApiService.OFFLINE;
        }
        return $$0.createUserApiService($$1.a.a.d());
    }

    public static ayy e() {
        return ayy.a("vanilla", ClientBrandRetriever::getClientModName, "Client", flk.class);
    }

    private void a(Throwable $$0, @Nullable b $$1) {
        if (this.an.e().size() > 1) {
            a($$0, (wp) null, $$1);
        } else {
            af.a($$0);
        }
    }

    public void a(Throwable $$0, @Nullable wp $$1, @Nullable b $$2) {
        G.info("Caught error loading resourcepacks, removing all selected resourcepacks", $$0);
        this.bp.a($$0);
        this.am.b();
        this.an.b(Collections.emptyList());
        this.n.i.clear();
        this.n.j.clear();
        this.n.az();
        a(true, $$2).thenRunAsync(() -> {
            a($$1);
        }, (Executor) this);
    }

    private void bi() {
        a((fug) null);
        if (this.s != null) {
            this.s.ac();
            y();
        }
        a((fum) new fuo());
        a((wp) null);
    }

    private void a(@Nullable wp $$0) {
        frf $$1 = aA();
        frd.b($$1, frd.a.c, wp.c("resourcePack.load_fail"), $$0);
    }

    public void a(Exception $$0) {
        if (!this.an.b()) {
            if (this.an.e().size() <= 1) {
                G.error(LogUtils.FATAL_MARKER, $$0.getMessage(), $$0);
                c(new o($$0.getMessage(), $$0));
                return;
            } else {
                a_(this::bi);
                return;
            }
        }
        a($$0, wp.c("resourcePack.runtime_failure"), (b) null);
    }

    public void f() {
        this.bc = Thread.currentThread();
        if (Runtime.getRuntime().availableProcessors() > 4) {
            this.bc.setPriority(10);
        }
        DiscontinuousFrame $$0 = TracyClient.createDiscontinuousFrame("Client Tick");
        boolean $$1 = false;
        while (this.bd) {
            try {
                bj();
                try {
                    box $$2 = box.a("Renderer");
                    boolean $$3 = aQ().e();
                    bot.a $$4 = bot.a(a($$3, $$2));
                    try {
                        this.bo.c();
                        $$0.start();
                        c(!$$1);
                        $$0.end();
                        this.bo.d();
                        if ($$4 != null) {
                            $$4.close();
                        }
                        b($$3, $$2);
                    } catch (Throwable th) {
                        if ($$4 != null) {
                            try {
                                $$4.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (OutOfMemoryError $$5) {
                    if ($$1) {
                        throw $$5;
                    }
                    bl();
                    a((fum) new fuf());
                    System.gc();
                    G.error(LogUtils.FATAL_MARKER, "Out of memory", $$5);
                    $$1 = true;
                }
            } catch (z $$6) {
                G.error(LogUtils.FATAL_MARKER, "Reported exception thrown!", $$6);
                c($$6.a());
                return;
            } catch (Throwable $$7) {
                G.error(LogUtils.FATAL_MARKER, "Unreported exception thrown!", $$7);
                c(new o("Unexpected error", $$7));
                return;
            }
        }
    }

    void g() {
        this.au.a(this.n);
    }

    private void a(int $$0, long $$1) {
        this.n.Q().a((fln<Boolean>) false);
        this.n.az();
    }

    public fef h() {
        return this.aq;
    }

    public String i() {
        return this.ad;
    }

    public String j() {
        return this.ae;
    }

    public void a(o $$0) {
        this.be = () -> {
            return d($$0);
        };
    }

    public void b(o $$0) {
        this.be = () -> {
            return $$0;
        };
    }

    private void bj() {
        if (this.be != null) {
            a(this, this.q, this.be.get());
        }
    }

    public void c(o $$0) {
        ayx.b();
        o $$1 = d($$0);
        bl();
        a(this, this.q, $$1);
    }

    public static int a(File $$0, o $$1) {
        Path $$2 = $$0.toPath().resolve("crash-reports");
        Path $$3 = $$2.resolve("crash-" + af.f() + "-client.txt");
        akx.a($$1.a(y.a));
        if ($$1.e() != null) {
            akx.a("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf($$1.e().toAbsolutePath()));
            return -1;
        }
        if ($$1.a($$3, y.a)) {
            akx.a("#@!@# Game crashed! Crash report saved to: #@!@# " + String.valueOf($$3.toAbsolutePath()));
            return -1;
        }
        akx.a("#@?@# Game crashed! Crash report could not be saved. #@?@#");
        return -2;
    }

    public static void a(@Nullable flk $$0, File $$1, o $$2) {
        int $$3 = a($$1, $$2);
        if ($$0 != null) {
            $$0.as.h();
        }
        System.exit($$3);
    }

    public boolean k() {
        return this.n.S().c().booleanValue();
    }

    public CompletableFuture<Void> l() {
        return a(false, (b) null);
    }

    private CompletableFuture<Void> a(boolean $$0, @Nullable b $$1) {
        if (this.bk != null) {
            return this.bk;
        }
        CompletableFuture<Void> $$2 = new CompletableFuture<>();
        if (!$$0 && (this.ba instanceof fuc)) {
            this.bk = $$2;
            return $$2;
        }
        this.an.a();
        List<atc> $$3 = this.an.h();
        if (!$$0) {
            this.bp.a(flr.b.MANUAL, $$3);
        }
        a((fug) new fuc(this, this.ak.a(af.h().a("resourceLoad"), this, J, $$3), $$32 -> {
            af.a($$32, $$22 -> {
                if ($$0) {
                    this.am.c();
                    bi();
                } else {
                    a($$22, $$1);
                }
            }, () -> {
                this.f.e();
                this.bp.a();
                this.am.d();
                $$2.complete(null);
                a($$1);
            });
        }, !$$0));
        return $$2;
    }

    private void bk() {
        boolean $$0 = false;
        gnc $$1 = ap().a();
        hgt $$2 = $$1.a().a();
        for (djn $$3 : mb.e) {
            UnmodifiableIterator it = $$3.l().a().iterator();
            while (it.hasNext()) {
                dwy $$4 = (dwy) it.next();
                if ($$4.o() == dpy.MODEL) {
                    hgt $$5 = $$1.b($$4);
                    if ($$5 == $$2) {
                        G.debug("Missing model for: {}", $$4);
                        $$0 = true;
                    }
                }
            }
        }
        het $$6 = $$2.d();
        for (djn $$7 : mb.e) {
            UnmodifiableIterator it2 = $$7.l().a().iterator();
            while (it2.hasNext()) {
                dwy $$8 = (dwy) it2.next();
                het $$9 = $$1.a($$8);
                if (!$$8.l() && $$9 == $$6) {
                    G.debug("Missing particle icon for: {}", $$8);
                }
            }
        }
        mb.g.c().forEach($$02 -> {
            cwm $$12 = (cwm) $$02.a();
            String $$22 = $$12.l();
            String $$32 = wp.c($$22).getString();
            if ($$32.toLowerCase(Locale.ROOT).equals($$12.l())) {
                G.debug("Missing translation for: {} {} {}", new Object[]{$$02.h().a(), $$22, $$12});
            }
        });
        if ($$0 | fud.a() | gsg.a()) {
            throw new IllegalStateException("Your game data is foobar, fix the errors above!");
        }
    }

    public evg m() {
        return this.ag;
    }

    private void a(String $$0) {
        a $$1 = J();
        if (!$$1.a(T())) {
            if (this.m.b()) {
                this.m.b(false);
                a((fum) new ftj($$02 -> {
                    if ($$02) {
                        af.n().a(axv.g);
                    }
                    a((fum) null);
                }, a.e, axv.g, true));
                return;
            } else {
                wp $$2 = $$1.a();
                this.m.a($$2, false);
                this.bt.c($$2);
                this.m.b($$1 == a.DISABLED_BY_PROFILE);
                return;
            }
        }
        a((fum) new fti($$0));
    }

    public void a(@Nullable fum $$0) {
        if (ab.aU && Thread.currentThread() != this.bc) {
            G.error("setScreen called from non-game thread");
        }
        if (this.z != null) {
            this.z.aI_();
        } else {
            a(flh.NONE);
        }
        if ($$0 == null && this.bb) {
            throw new IllegalStateException("Trying to return to in-game GUI during disconnection");
        }
        if ($$0 == null && this.s == null) {
            $$0 = new fuo();
        } else if ($$0 == null && this.t.eE()) {
            if (this.t.t()) {
                $$0 = new ftq(null, this.s.D_().l());
            } else {
                this.t.gg();
            }
        }
        this.z = $$0;
        if (this.z != null) {
            this.z.aJ_();
        }
        ffr.a();
        if ($$0 != null) {
            this.o.j();
            fli.b();
            $$0.b(this, this.S.o(), this.S.p());
            this.y = false;
        } else {
            this.as.i();
            this.o.i();
        }
        d();
    }

    public void a(@Nullable fug $$0) {
        this.ba = $$0;
    }

    public void n() {
        try {
            G.info("Stopping!");
            try {
                this.bt.c();
            } catch (Throwable th) {
            }
            try {
                if (this.s != null) {
                    this.s.ac();
                }
                y();
            } catch (Throwable th2) {
            }
            if (this.z != null) {
                this.z.aI_();
            }
            close();
            af.c = System::nanoTime;
            if (this.be == null) {
                System.exit(0);
            }
        } catch (Throwable th3) {
            af.c = System::nanoTime;
            if (this.be == null) {
                System.exit(0);
            }
            throw th3;
        }
    }

    @Override // defpackage.brg, java.lang.AutoCloseable
    public void close() {
        if (this.bs != null) {
            this.bs.a();
        }
        try {
            try {
                this.aO.close();
                this.ax.close();
                this.aD.close();
                this.au.close();
                this.j.close();
                this.P.close();
                this.f.close();
                this.as.g();
                this.g.a();
                this.aG.close();
                this.aF.close();
                this.aI.close();
                this.aJ.close();
                this.aH.close();
                this.O.close();
                this.ak.close();
                if (this.ar != null) {
                    this.ar.close();
                }
                frw.b();
                af.k();
                this.R.close();
                this.S.close();
            } catch (Throwable $$0) {
                G.error("Shutdown failure!", $$0);
                throw $$0;
            }
        } catch (Throwable th) {
            this.R.close();
            this.S.close();
            throw th;
        }
    }

    private void c(boolean $$0) {
        boolean $$8;
        String $$13;
        this.S.a("Pre render");
        if (this.S.c()) {
            q();
        }
        if (this.bk != null && !(this.ba instanceof fuc)) {
            CompletableFuture<Void> $$1 = this.bk;
            this.bk = null;
            l().thenRun(() -> {
                $$1.complete(null);
            });
        }
        while (true) {
            Runnable $$2 = this.bj.poll();
            if ($$2 == null) {
                break;
            } else {
                $$2.run();
            }
        }
        int $$3 = this.T.a(af.c(), $$0);
        bou $$4 = bot.a();
        if ($$0) {
            $$4.a("scheduledExecutables");
            bA();
            $$4.c();
            $$4.a("tick");
            for (int $$5 = 0; $$5 < Math.min(10, $$3); $$5++) {
                $$4.f("clientTick");
                t();
            }
            $$4.c();
        }
        this.S.a("Render");
        $$4.a("sound");
        this.as.a(this.j.k());
        $$4.b("toasts");
        this.aK.a();
        $$4.b("render");
        long $$6 = af.d();
        if (aQ().d() || this.bo.e()) {
            $$8 = this.bs == null || this.bs.b();
            if ($$8) {
                ffo.a().ifPresent((v0) -> {
                    v0.b();
                });
            }
        } else {
            $$8 = false;
            this.br = ecl.a;
        }
        RenderSystem.clear(16640);
        this.aq.a(true);
        RenderSystem.setShaderFog(glo.a);
        $$4.a("display");
        RenderSystem.enableCull();
        $$4.b("mouse");
        this.o.a();
        $$4.c();
        if (!this.y) {
            $$4.b("gameRenderer");
            this.j.a(this.T, $$0);
            $$4.c();
        }
        $$4.a("blit");
        this.aq.e();
        if (!this.S.u()) {
            this.aq.c(this.S.k(), this.S.l());
        }
        this.bg = af.d() - $$6;
        if ($$8) {
            ffo.a().ifPresent($$02 -> {
                this.bs = $$02.c();
            });
        }
        $$4.b("updateDisplay");
        if (this.ar != null) {
            this.ar.a();
            this.ar.a(this.aq);
        }
        this.S.a(this.ar);
        int $$9 = this.bh.a();
        if ($$9 < 260) {
            RenderSystem.limitDisplayFPS($$9);
        }
        $$4.b("yield");
        Thread.yield();
        $$4.c();
        this.S.a("Post render");
        this.aZ++;
        this.aW = U() && ((this.z != null && this.z.k()) || (this.ba != null && this.ba.a())) && !this.aS.r();
        this.T.b(this.aW);
        this.T.c(!bq());
        long $$10 = af.d();
        long $$11 = $$10 - this.aX;
        if ($$8) {
            this.bq = $$11;
        }
        aQ().a($$11);
        this.aX = $$10;
        $$4.a("fpsUpdate");
        if (this.bs != null && this.bs.b()) {
            this.br = (this.bs.c() * 100.0d) / this.bq;
        }
        while (af.c() >= this.aY + 1000) {
            if (this.br > ecl.a) {
                $$13 = " GPU: " + (this.br > 100.0d ? String.valueOf(n.RED) + "100%" : Math.round(this.br) + "%");
            } else {
                $$13 = "";
            }
            bf = this.aZ;
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[7];
            objArr[0] = Integer.valueOf(bf);
            objArr[1] = $$9 == 260 ? "inf" : Integer.valueOf($$9);
            objArr[2] = this.n.Q().c().booleanValue() ? " vsync " : " ";
            objArr[3] = this.n.k().c();
            objArr[4] = this.n.j().c() == fkw.OFF ? "" : this.n.j().c() == fkw.FAST ? " fast-clouds" : " fancy-clouds";
            objArr[5] = this.n.G().c();
            objArr[6] = $$13;
            this.A = String.format(locale, "%d fps T: %s%s%s%s B: %d%s", objArr);
            this.aY += 1000;
            this.aZ = 0;
        }
        $$4.c();
    }

    private bou a(boolean $$0, @Nullable box $$1) {
        bou $$3;
        if (!$$0) {
            this.bn.b();
            if (!this.bo.e() && $$1 == null) {
                return boq.a;
            }
        }
        if ($$0) {
            if (!this.bn.a()) {
                this.bm = 0;
                this.bn.c();
            }
            this.bm++;
            $$3 = this.bn.d();
        } else {
            $$3 = boq.a;
        }
        if (this.bo.e()) {
            $$3 = bou.a($$3, this.bo.f());
        }
        return box.a($$3, $$1);
    }

    private void b(boolean $$0, @Nullable box $$1) {
        if ($$1 != null) {
            $$1.b();
        }
        fqn $$2 = aQ().o();
        if ($$0) {
            $$2.a(this.bn.e());
        } else {
            $$2.a((bos) null);
        }
    }

    @Override // defpackage.fez
    public void a() {
        int $$0 = this.S.a(this.n.at().c().intValue(), k());
        this.S.a($$0);
        if (this.z != null) {
            this.z.a(this, this.S.o(), this.S.p());
        }
        fef $$1 = h();
        $$1.a(this.S.k(), this.S.l());
        this.j.a(this.S.k(), this.S.l());
        this.o.g();
    }

    @Override // defpackage.fez
    public void b() {
        this.o.k();
    }

    public int o() {
        return bf;
    }

    public long p() {
        return this.bg;
    }

    private void bl() {
        ayx.b();
        try {
            if (this.aU && this.aS != null) {
                this.aS.a(true);
            }
            b(new ftx(wp.c("menu.savingLevel")));
        } catch (Throwable th) {
        }
        System.gc();
    }

    public boolean b(Consumer<wp> $$0) {
        Consumer<Path> $$8;
        if (this.bo.e()) {
            bm();
            return false;
        }
        Consumer<bos> $$1 = $$12 -> {
            if ($$12 == boo.a) {
                return;
            }
            int $$2 = $$12.f();
            double $$3 = $$12.g() / bab.a;
            execute(() -> {
                $$0.accept(wp.a("commands.debug.stopped", String.format(Locale.ROOT, "%.2f", Double.valueOf($$3)), Integer.valueOf($$2), String.format(Locale.ROOT, "%.2f", Double.valueOf($$2 / $$3))));
            });
        };
        Consumer<Path> $$2 = $$13 -> {
            wp $$22 = wp.b($$13.toString()).a(n.UNDERLINE).a($$13 -> {
                return $$13.a(new wn(wn.a.OPEN_FILE, $$13.toFile().getParent()));
            });
            execute(() -> {
                $$0.accept(wp.a("debug.profiling.stop", $$22));
            });
        };
        ad $$3 = a(new ad(), this, this.ao, this.ad, this.n);
        Consumer<List<Path>> $$4 = $$22 -> {
            Path $$32 = a($$3, (List<Path>) $$22);
            $$2.accept($$32);
        };
        if (this.aS == null) {
            $$8 = $$14 -> {
                $$4.accept(ImmutableList.of($$14));
            };
        } else {
            this.aS.b($$3);
            CompletableFuture<Path> $$6 = new CompletableFuture<>();
            CompletableFuture<Path> $$7 = new CompletableFuture<>();
            CompletableFuture.allOf($$6, $$7).thenRunAsync(() -> {
                $$4.accept(ImmutableList.of((Path) $$6.join(), (Path) $$7.join()));
            }, (Executor) af.i());
            hje hjeVar = this.aS;
            Consumer<bos> consumer = $$02 -> {
            };
            Objects.requireNonNull($$7);
            hjeVar.a(consumer, (v1) -> {
                r2.complete(v1);
            });
            Objects.requireNonNull($$6);
            $$8 = (v1) -> {
                r0.complete(v1);
            };
        }
        this.bo = bqj.a(new glc(af.c, this.f), af.c, af.i(), new bqp("client"), $$15 -> {
            this.bo = bqk.a;
            $$1.accept($$15);
        }, $$8);
        return true;
    }

    private void bm() {
        this.bo.a();
        if (this.aS != null) {
            this.aS.aV();
        }
    }

    private void bn() {
        this.bo.b();
        if (this.aS != null) {
            this.aS.aW();
        }
    }

    private Path a(ad $$0, List<Path> $$1) {
        String $$4;
        if (T()) {
            $$4 = V().aZ().e();
        } else {
            ggp $$3 = S();
            $$4 = $$3 != null ? $$3.a : "unknown";
        }
        try {
            String $$5 = String.format(Locale.ROOT, "%s-%s-%s", af.f(), $$4, ab.b().b());
            String $$6 = v.a(bqp.a, $$5, ".zip");
            Path $$9 = bqp.a.resolve($$6);
            try {
                ayk $$10 = new ayk($$9);
                try {
                    $$10.a(Paths.get("system.txt", new String[0]), $$0.a());
                    $$10.a(Paths.get("client", new String[0]).resolve(this.n.aF().getName()), this.n.aG());
                    Objects.requireNonNull($$10);
                    $$1.forEach($$10::a);
                    $$10.close();
                    return $$9;
                } finally {
                }
            } finally {
                for (Path $$11 : $$1) {
                    try {
                        FileUtils.forceDelete($$11.toFile());
                    } catch (IOException $$12) {
                        G.warn("Failed to delete temporary profiling result {}", $$11, $$12);
                    }
                }
            }
        } catch (IOException $$8) {
            throw new UncheckedIOException($$8);
        }
    }

    public void q() {
        this.bd = false;
    }

    public boolean r() {
        return this.bd;
    }

    public void b(boolean $$0) {
        if (this.z != null) {
            return;
        }
        boolean $$1 = U() && !this.aS.r();
        if ($$1) {
            a((fum) new fuh(!$$0));
            this.as.e();
        } else {
            a((fum) new fuh(true));
        }
    }

    private void d(boolean $$0) {
        if (!$$0) {
            this.x = 0;
        }
        if (this.x > 0 || this.t.fz()) {
            return;
        }
        if ($$0 && this.w != null && this.w.d() == faz.a.BLOCK) {
            fax $$1 = (fax) this.w;
            ji $$2 = $$1.b();
            if (!this.s.a_($$2).l()) {
                jn $$3 = $$1.c();
                if (this.r.b($$2, $$3)) {
                    this.g.a($$2, $$3);
                    this.t.a(bsk.MAIN_HAND);
                    return;
                }
                return;
            }
            return;
        }
        this.r.b();
    }

    private boolean bo() {
        if (this.x > 0) {
            return false;
        }
        if (this.w == null) {
            G.error("Null returned as 'hitResult', this shouldn't happen!");
            if (this.r.e()) {
                this.x = 10;
                return false;
            }
            return false;
        }
        if (this.t.D()) {
            return false;
        }
        cwq $$0 = this.t.b(bsk.MAIN_HAND);
        if (!$$0.a(this.s.K())) {
            return false;
        }
        boolean $$1 = false;
        switch (this.w.d()) {
            case ENTITY:
                this.r.a(this.t, ((fay) this.w).a());
                break;
            case BLOCK:
                fax $$2 = (fax) this.w;
                ji $$3 = $$2.b();
                if (!this.s.a_($$3).l()) {
                    this.r.a($$3, $$2.c());
                    if (this.s.a_($$3).l()) {
                        $$1 = true;
                        break;
                    }
                }
                break;
            case MISS:
                if (this.r.e()) {
                    this.x = 10;
                }
                this.t.gD();
                break;
        }
        this.t.a(bsk.MAIN_HAND);
        return $$1;
    }

    private void bp() {
        if (this.r.k()) {
            return;
        }
        this.aV = 4;
        if (this.t.D()) {
            return;
        }
        if (this.w == null) {
            G.warn("Null returned as 'hitResult', this shouldn't happen!");
        }
        for (bsk $$0 : bsk.values()) {
            cwq $$1 = this.t.b($$0);
            if (!$$1.a(this.s.K())) {
                return;
            }
            if (this.w != null) {
                switch (this.w.d()) {
                    case ENTITY:
                        fay $$2 = (fay) this.w;
                        bum $$3 = $$2.a();
                        if (!this.s.F_().a($$3.dv())) {
                            return;
                        }
                        bsl $$4 = this.r.a(this.t, $$3, $$2, $$0);
                        if (!$$4.a()) {
                            $$4 = this.r.a(this.t, $$3, $$0);
                        }
                        if ($$4 instanceof bsl.d) {
                            bsl.d $$5 = (bsl.d) $$4;
                            if ($$5.e() == bsl.e.CLIENT) {
                                this.t.a($$0);
                                return;
                            }
                            return;
                        }
                        break;
                    case BLOCK:
                        fax $$6 = (fax) this.w;
                        int $$7 = $$1.M();
                        bsl $$8 = this.r.a(this.t, $$0, $$6);
                        if ($$8 instanceof bsl.d) {
                            bsl.d $$9 = (bsl.d) $$8;
                            if ($$9.e() == bsl.e.CLIENT) {
                                this.t.a($$0);
                                if ($$1.f()) {
                                    return;
                                }
                                if ($$1.M() != $$7 || this.r.f()) {
                                    this.j.c.a($$0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if ($$8 instanceof bsl.a) {
                            return;
                        }
                        break;
                }
            }
            if (!$$1.f()) {
                bsl $$10 = this.r.a(this.t, $$0);
                if ($$10 instanceof bsl.d) {
                    bsl.d $$11 = (bsl.d) $$10;
                    if ($$11.e() == bsl.e.CLIENT) {
                        this.t.a($$0);
                    }
                    this.j.c.a($$0);
                    return;
                }
            }
        }
    }

    public hjr s() {
        return this.at;
    }

    public void t() {
        this.bA++;
        if (this.s != null && !this.aW) {
            this.s.u().m();
        }
        if (this.aV > 0) {
            this.aV--;
        }
        bou $$0 = bot.a();
        $$0.a("gui");
        this.bu.a();
        this.m.a(this.aW);
        $$0.c();
        this.j.a(1.0f);
        this.aL.a(this.s, this.w);
        $$0.a("gameMode");
        if (!this.aW && this.s != null) {
            this.r.c();
        }
        $$0.b("textures");
        if (bq()) {
            this.O.e();
        }
        if (this.z == null && this.t != null) {
            if (this.t.eE() && !(this.z instanceof ftq)) {
                a((fum) null);
            } else if (this.t.fR() && this.s != null) {
                a((fum) new ftz());
            }
        } else {
            fum fumVar = this.z;
            if (fumVar instanceof ftz) {
                ftz $$1 = (ftz) fumVar;
                if (!this.t.fR()) {
                    $$1.m();
                }
            }
        }
        if (this.z != null) {
            this.x = 10000;
        }
        if (this.z != null) {
            try {
                this.z.e();
            } catch (Throwable $$2) {
                o $$3 = o.a($$2, "Ticking screen");
                this.z.a($$3);
                throw new z($$3);
            }
        }
        if (!aQ().d()) {
            this.m.l();
        }
        if (this.ba == null && this.z == null) {
            $$0.b("Keybindings");
            bs();
            if (this.x > 0) {
                this.x--;
            }
        }
        if (this.s != null) {
            $$0.b("gameRenderer");
            if (!this.aW) {
                this.j.e();
            }
            $$0.b("levelRenderer");
            if (!this.aW) {
                this.f.n();
            }
            $$0.b("level");
            if (!this.aW) {
                this.s.e();
            }
        } else if (this.j.f() != null) {
            this.j.b();
        }
        if (!this.aW) {
            this.at.a();
        }
        this.as.a(this.aW);
        if (this.s != null) {
            if (!this.aW) {
                if (!this.n.s && br()) {
                    wp $$4 = wp.c("tutorial.socialInteractions.title");
                    wp $$5 = wp.a("tutorial.socialInteractions.description", hky.a("socialInteractions"));
                    this.bl = new frg(this.h, frg.a.SOCIAL_INTERACTIONS, $$4, $$5, true, 8000);
                    this.aK.a(this.bl);
                    this.n.s = true;
                    this.n.az();
                }
                this.aL.d();
                try {
                    this.s.a(() -> {
                        return true;
                    });
                } catch (Throwable $$6) {
                    o $$7 = o.a($$6, "Exception in world tick");
                    if (this.s == null) {
                        p $$8 = $$7.a("Affected level");
                        $$8.a("Problem", "Level is null!");
                    } else {
                        this.s.a($$7);
                    }
                    throw new z($$7);
                }
            }
            $$0.b("animateTick");
            if (!this.aW && bq()) {
                this.s.b(this.t.dz(), this.t.dB(), this.t.dF());
            }
            $$0.b("particles");
            if (!this.aW && bq()) {
                this.g.b();
            }
            ggb $$9 = L();
            if ($$9 != null && !this.aW) {
                $$9.b(ags.a);
            }
        } else if (this.aT != null) {
            $$0.b("pendingConnection");
            this.aT.b();
        }
        $$0.b("keyboard");
        this.p.b();
        $$0.c();
    }

    private boolean bq() {
        return this.s == null || this.s.u().i();
    }

    private boolean br() {
        return !this.aU || (this.aS != null && this.aS.r());
    }

    private void bs() {
        while (this.n.N.g()) {
            fkt $$0 = this.n.aE();
            this.n.a(this.n.aE().c());
            if ($$0.a() != this.n.aE().a()) {
                this.j.a(this.n.aE().a() ? ao() : null);
            }
            this.f.p();
        }
        while (this.n.O.g()) {
            this.n.Z = !this.n.Z;
        }
        for (int $$1 = 0; $$1 < 9; $$1++) {
            boolean $$2 = this.n.T.e();
            boolean $$3 = this.n.U.e();
            if (this.n.S[$$1].g()) {
                if (this.t.Z_()) {
                    this.m.g().a($$1);
                } else if (this.t.b() && this.z == null && ($$3 || $$2)) {
                    fvr.a(this, $$1, $$3, $$2);
                } else {
                    this.t.gi().j = $$1;
                }
            }
        }
        while (this.n.L.g()) {
            if (!br()) {
                this.t.a(K, true);
                this.bt.c(K);
            } else {
                if (this.bl != null) {
                    this.bl.d();
                    this.bl = null;
                }
                a((fum) new fze());
            }
        }
        while (this.n.C.g()) {
            if (this.r.g()) {
                this.t.l();
            } else {
                this.aL.a();
                a((fum) new fwc(this.t));
            }
        }
        while (this.n.R.g()) {
            a((fum) new fuw(this.t.j.p()));
        }
        while (this.n.D.g()) {
            if (!this.t.Z_()) {
                L().b(new ahm(ahm.a.SWAP_ITEM_WITH_OFFHAND, ji.c, jn.DOWN));
            }
        }
        while (this.n.E.g()) {
            if (!this.t.Z_() && this.t.a(fum.s())) {
                this.t.a(bsk.MAIN_HAND);
            }
        }
        while (this.n.I.g()) {
            a("");
        }
        if (this.z == null && this.ba == null && this.n.K.g()) {
            a(atm.a);
        }
        boolean $$4 = false;
        if (this.t.fz()) {
            if (!this.n.F.e()) {
                this.r.b(this.t);
            }
            while (this.n.G.g()) {
            }
            while (this.n.F.g()) {
            }
            while (this.n.H.g()) {
            }
        } else {
            while (this.n.G.g()) {
                $$4 |= bo();
            }
            while (this.n.F.g()) {
                bp();
            }
            while (this.n.H.g()) {
                bu();
            }
        }
        if (this.n.F.e() && this.aV == 0 && !this.t.fz()) {
            bp();
        }
        d(this.z == null && !$$4 && this.n.G.e() && this.o.h());
    }

    public hka u() {
        return this.aO;
    }

    public double v() {
        return this.br;
    }

    public ggn w() {
        return this.aP;
    }

    public fzy x() {
        return new fzy(this, this.ag);
    }

    public void a(evg.c $$0, aua $$1, alu $$2, boolean $$3) {
        y();
        this.aa.set(null);
        Instant $$4 = Instant.now();
        try {
            $$0.a($$2.c().a(), $$2.d());
            alq $$5 = alq.a(this.ay, this.q);
            $$5.f().a(this);
            dvp.a($$5, this);
            auz.a(false);
            this.aS = (hje) MinecraftServer.a($$42 -> {
                return new hje($$42, this, $$0, $$1, $$2, $$5, $$02 -> {
                    arr $$12 = arr.b($$02 + 0);
                    this.aa.set($$12);
                    Queue<Runnable> queue = this.bj;
                    Objects.requireNonNull(queue);
                    return arq.a($$12, (v1) -> {
                        r1.add(v1);
                    });
                });
            });
            this.aU = true;
            a(ghg.a());
            this.aR.a(glf.c.SINGLEPLAYER, $$0.f(), $$2.d().e());
            while (this.aa.get() == null) {
                Thread.yield();
            }
            fua $$9 = new fua(this.aa.get());
            bou $$10 = bot.a();
            a((fum) $$9);
            $$10.a("waitForServer");
            while (true) {
                if (!this.aS.ai() || this.ba != null) {
                    $$9.e();
                    c(false);
                    try {
                        Thread.sleep(16L);
                    } catch (InterruptedException e2) {
                    }
                    bj();
                } else {
                    $$10.c();
                    Duration $$11 = Duration.between($$4, Instant.now());
                    SocketAddress $$12 = this.aS.ah().a();
                    vi $$13 = vi.a($$12);
                    $$13.a($$12.toString(), 0, new gfz($$13, this, null, null, $$3, $$11, $$02 -> {
                    }, null));
                    $$13.a(new aja(X().c(), X().b()));
                    this.aT = $$13;
                    return;
                }
            }
        } catch (Throwable $$6) {
            o $$7 = o.a($$6, "Starting integrated server");
            p $$8 = $$7.a("Starting integrated server");
            $$8.a("Level ID", $$0.f());
            $$8.a("Level Name", () -> {
                return $$2.d().e();
            });
            throw new z($$7);
        }
    }

    public void a(gga $$0, fuk.a $$1) {
        e(new fuk(() -> {
            return false;
        }, $$1));
        this.s = $$0;
        a($$0);
        if (!this.aU) {
            alq $$2 = alq.a(this.ay, this.q);
            $$2.f().a(this);
            dvp.a($$2, this);
            auz.a(false);
        }
    }

    public void y() {
        a((fum) new fuj(true), false);
    }

    public void b(fum $$0) {
        a($$0, false);
    }

    public void a(fum $$0, boolean $$1) {
        ggb $$2 = L();
        if ($$2 != null) {
            bz();
            $$2.h();
            if (!$$1) {
                z();
            }
        }
        this.aM.b();
        if (this.bo.e()) {
            bn();
        }
        hje $$3 = this.aS;
        this.aS = null;
        this.j.h();
        this.r = null;
        this.bt.b();
        this.bb = true;
        try {
            e($$0);
            if (this.s != null) {
                if ($$3 != null) {
                    bou $$4 = bot.a();
                    $$4.a("waitForServer");
                    while (!$$3.I()) {
                        c(false);
                    }
                    $$4.c();
                }
                this.m.i();
                this.aU = false;
            }
            this.s = null;
            a((gga) null);
            this.t = null;
            this.bb = false;
            dvp.b();
        } catch (Throwable th) {
            this.bb = false;
            throw th;
        }
    }

    public void z() {
        this.am.i();
        bA();
    }

    public void c(fum $$0) {
        ggb $$1 = L();
        if ($$1 != null) {
            $$1.i();
        }
        if (this.bo.e()) {
            bn();
        }
        this.j.h();
        this.r = null;
        this.bt.b();
        this.bb = true;
        try {
            e($$0);
            this.m.i();
            this.s = null;
            a((gga) null);
            this.t = null;
            dvp.b();
        } finally {
            this.bb = false;
        }
    }

    private void e(fum $$0) {
        bou $$1 = bot.a();
        $$1.a("forcedTick");
        this.as.f();
        this.u = null;
        this.aT = null;
        a($$0);
        c(false);
        $$1.c();
    }

    public void d(fum $$0) {
        boz $$1 = bot.a().d("forcedTick");
        try {
            a($$0);
            c(false);
            if ($$1 != null) {
                $$1.close();
            }
        } catch (Throwable th) {
            if ($$1 != null) {
                try {
                    $$1.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private void a(@Nullable gga $$0) {
        this.f.a($$0);
        this.g.a($$0);
        this.aN.a($$0);
        d();
    }

    private UserApiService.UserProperties bt() {
        return this.aB.join();
    }

    public boolean C() {
        return D() && this.n.al().c().booleanValue();
    }

    public boolean D() {
        return E() && bt().flag(UserApiService.UserFlag.OPTIONAL_TELEMETRY_AVAILABLE);
    }

    public boolean E() {
        if (ab.aU) {
            return false;
        }
        return bt().flag(UserApiService.UserFlag.TELEMETRY_ENABLED);
    }

    public boolean F() {
        return this.ai && bt().flag(UserApiService.UserFlag.SERVERS_ALLOWED) && H() == null && !I();
    }

    public boolean G() {
        return bt().flag(UserApiService.UserFlag.REALMS_ALLOWED) && H() == null;
    }

    @Nullable
    public BanDetails H() {
        return (BanDetails) bt().bannedScopes().get("MULTIPLAYER");
    }

    public boolean I() {
        ProfileResult $$0 = this.N.getNow(null);
        return $$0 != null && $$0.actions().contains(ProfileActionType.FORCED_NAME_CHANGE);
    }

    public boolean a(UUID $$0) {
        if (J().a(false)) {
            return this.aM.c($$0);
        }
        return (this.t == null || !$$0.equals(this.t.cG())) && !$$0.equals(af.e);
    }

    public a J() {
        if (this.n.n().c() == cov.HIDDEN) {
            return a.DISABLED_BY_OPTIONS;
        }
        if (!this.aj) {
            return a.DISABLED_BY_LAUNCHER;
        }
        if (!bt().flag(UserApiService.UserFlag.CHAT_ALLOWED)) {
            return a.DISABLED_BY_PROFILE;
        }
        return a.ENABLED;
    }

    public final boolean K() {
        return this.ah;
    }

    @Nullable
    public ggb L() {
        if (this.t == null) {
            return null;
        }
        return this.t.j;
    }

    public static boolean M() {
        return !F.n.X;
    }

    public static boolean N() {
        return F.n.k().c().b() >= flc.FANCY.b();
    }

    public static boolean O() {
        return !F.j.a() && F.n.k().c().b() >= flc.FABULOUS.b();
    }

    public static boolean P() {
        return F.n.l().c().booleanValue();
    }

    private void bu() {
        if (this.w == null || this.w.d() == faz.a.MISS) {
            return;
        }
        boolean $$0 = fum.s();
        faz fazVar = this.w;
        Objects.requireNonNull(fazVar);
        switch ((int) SwitchBootstraps.typeSwitch(MethodHandles.lookup(), "typeSwitch", MethodType.methodType(Integer.TYPE, Object.class, Integer.TYPE), fax.class, fay.class).dynamicInvoker().invoke(fazVar, 0) /* invoke-custom */) {
            case 0:
                fax $$1 = (fax) fazVar;
                this.r.a($$1.b(), $$0);
                break;
            case 1:
                fay $$2 = (fay) fazVar;
                this.r.a($$2.a(), $$0);
                break;
        }
    }

    public o d(o $$0) {
        ad $$1 = $$0.f();
        try {
            a($$1, this, this.ao, this.ad, this.n);
            a($$0.a("Uptime"));
            if (this.s != null) {
                this.s.a($$0);
            }
            if (this.aS != null) {
                this.aS.b($$1);
            }
            this.bp.a($$0);
        } catch (Throwable $$2) {
            G.error("Failed to collect details", $$2);
        }
        return $$0;
    }

    public static void a(@Nullable flk $$0, @Nullable hgd $$1, String $$2, @Nullable flo $$3, o $$4) {
        ad $$5 = $$4.f();
        a($$5, $$0, $$1, $$2, $$3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(double $$0) {
        return String.format(Locale.ROOT, "%.3fs", Double.valueOf($$0));
    }

    private void a(p $$0) {
        $$0.a("JVM uptime", () -> {
            return a(ManagementFactory.getRuntimeMXBean().getUptime() / 1000.0d);
        });
        $$0.a("Wall uptime", () -> {
            return a((System.currentTimeMillis() - this.bz) / 1000.0d);
        });
        $$0.a("High-res time", () -> {
            return a(af.c() / 1000.0d);
        });
        $$0.a("Client ticks", () -> {
            return String.format(Locale.ROOT, "%d ticks / %.3fs", Long.valueOf(this.bA), Double.valueOf(this.bA / 20.0d));
        });
    }

    private static ad a(ad $$0, @Nullable flk $$1, @Nullable hgd $$2, String $$3, @Nullable flo $$4) {
        String $$6;
        $$0.a("Launched Version", () -> {
            return $$3;
        });
        String $$5 = bg();
        if ($$5 != null) {
            $$0.a("Launcher name", $$5);
        }
        $$0.a("Backend library", RenderSystem::getBackendDescription);
        $$0.a("Backend API", RenderSystem::getApiDescription);
        $$0.a("Window size", () -> {
            return $$1 != null ? $$1.S.k() + "x" + $$1.S.l() : "<not initialized>";
        });
        $$0.a("GFLW Platform", fey::a);
        $$0.a("GL Caps", RenderSystem::getCapsString);
        $$0.a("GL debug messages", () -> {
            return fen.b() ? String.join(axx.d, fen.a()) : "<disabled>";
        });
        $$0.a("Is Modded", () -> {
            return e().b();
        });
        $$0.a("Universe", () -> {
            return $$1 != null ? Long.toHexString($$1.L) : "404";
        });
        $$0.a("Type", "Client (map_client.txt)");
        if ($$4 != null) {
            if ($$1 != null && ($$6 = $$1.aj().m()) != null) {
                $$0.a("GPU Warnings", $$6);
            }
            $$0.a("Graphics mode", $$4.k().c().toString());
            $$0.a("Render Distance", $$4.aH() + "/" + String.valueOf($$4.e().c()) + " chunks");
        }
        if ($$1 != null) {
            $$0.a("Resource Packs", () -> {
                return aua.a($$1.ad().g());
            });
        }
        if ($$2 != null) {
            $$0.a("Current Language", () -> {
                return $$2.a();
            });
        }
        $$0.a("Locale", String.valueOf(Locale.getDefault()));
        $$0.a("System encoding", () -> {
            return System.getProperty("sun.jnu.encoding", "<not set>");
        });
        $$0.a("File encoding", () -> {
            return System.getProperty("file.encoding", "<not set>");
        });
        $$0.a("CPU", feo::b);
        return $$0;
    }

    public static flk Q() {
        return F;
    }

    public CompletableFuture<Void> R() {
        return a(this::l).thenCompose((Function<? super V, ? extends CompletionStage<U>>) $$0 -> {
            return $$0;
        });
    }

    public void a(ghg $$0) {
        if (!this.bv.a($$0)) {
            this.bv = ghj.a($$0, this.aA);
        }
    }

    @Nullable
    public ggp S() {
        return (ggp) x.a(L(), (Function<ggb, R>) (v0) -> {
            return v0.x();
        });
    }

    public boolean T() {
        return this.aU;
    }

    public boolean U() {
        return this.aU && this.aS != null;
    }

    @Nullable
    public hje V() {
        return this.aS;
    }

    public boolean W() {
        hje $$0 = V();
        return ($$0 == null || $$0.r()) ? false : true;
    }

    public boolean b(UUID $$0) {
        return $$0.equals(X().b());
    }

    public flw X() {
        return this.Z;
    }

    public GameProfile Y() {
        ProfileResult $$0 = this.N.join();
        if ($$0 != null) {
            return $$0.profile();
        }
        return new GameProfile(this.Z.b(), this.Z.c());
    }

    public Proxy Z() {
        return this.af;
    }

    public hev aa() {
        return this.O;
    }

    public gmq ab() {
        return this.P;
    }

    public aup ac() {
        return this.ak;
    }

    public aua ad() {
        return this.an;
    }

    public atg ae() {
        return this.al;
    }

    public hhs af() {
        return this.am;
    }

    public Path ag() {
        return this.M;
    }

    public hgd ah() {
        return this.ao;
    }

    public Function<akv, het> a(akv $$0) {
        hes c2 = this.aD.c($$0);
        Objects.requireNonNull(c2);
        return c2::a;
    }

    public boolean ai() {
        return this.aW;
    }

    public glr aj() {
        return this.aw;
    }

    public hjw ak() {
        return this.as;
    }

    public hjq al() {
        avx $$0 = (avx) x.a(this.z, (Function<fum, R>) (v0) -> {
            return v0.D();
        });
        if ($$0 != null) {
            return new hjq($$0);
        }
        if (this.t != null) {
            dgj $$1 = this.t.dV();
            if ($$1.ai() == dgj.k) {
                if (this.m.j().b()) {
                    return new hjq(avy.d);
                }
                return new hjq(avy.e);
            }
            jr<dhl> $$2 = $$1.t(this.t.dv());
            float $$3 = $$2.a().p();
            if (this.at.b(avy.f) || (this.t.bo() && $$2.a(awo.Z))) {
                return new hjq(avy.f, $$3);
            }
            if ($$1.ai() != dgj.j && this.t.gj().d && this.t.gj().c) {
                return new hjq(avy.b, $$3);
            }
            Optional<bqt<avx>> $$4 = $$2.a().o();
            if ($$4.isPresent()) {
                Optional<avx> $$5 = $$4.get().a($$1.A);
                return new hjq($$5.orElse(null), $$3);
            }
            return new hjq(avy.g, $$3);
        }
        return new hjq(avy.a);
    }

    public MinecraftSessionService am() {
        return this.az;
    }

    public hfw an() {
        return this.aC;
    }

    @Nullable
    public bum ao() {
        return this.u;
    }

    public void a(bum $$0) {
        this.u = $$0;
        this.j.a($$0);
    }

    public boolean b(bum $$0) {
        return $$0.co() || (this.t != null && this.t.Z_() && this.n.Q.e() && $$0.aq() == but.bR);
    }

    @Override // defpackage.bra
    protected Thread ay() {
        return this.bc;
    }

    @Override // defpackage.brg
    public Runnable f(Runnable $$0) {
        return $$0;
    }

    @Override // defpackage.bra
    protected boolean e(Runnable $$0) {
        return true;
    }

    public gnd ap() {
        return this.aE;
    }

    public gsd aq() {
        return this.V;
    }

    public gok ar() {
        return this.aN;
    }

    public gtd as() {
        return this.X;
    }

    public gly at() {
        return this.Y;
    }

    public DataFixer au() {
        return this.Q;
    }

    public fla av() {
        return this.T;
    }

    public fmm aw() {
        return this.ap;
    }

    public boolean az() {
        return (this.t != null && this.t.gz()) || this.n.Y().c().booleanValue();
    }

    public frf aA() {
        return this.aK;
    }

    public hky aB() {
        return this.aL;
    }

    public boolean aC() {
        return this.bi;
    }

    public flf aD() {
        return this.ab;
    }

    public hhh aE() {
        return this.aD;
    }

    public hfu aF() {
        return this.aF;
    }

    public hft aG() {
        return this.aG;
    }

    public hfs aH() {
        return this.aH;
    }

    public hfr aI() {
        return this.aI;
    }

    public fog aJ() {
        return this.aJ;
    }

    @Override // defpackage.fez
    public void a(boolean $$0) {
        this.bi = $$0;
    }

    public wp a(File $$0, int $$1, int $$2) {
        int $$3 = this.S.k();
        int $$4 = this.S.l();
        fef $$5 = h();
        float $$6 = this.t.dN();
        float $$7 = this.t.dL();
        float $$8 = this.t.O;
        float $$9 = this.t.N;
        this.j.b(false);
        try {
            try {
                this.j.c(true);
                this.S.a($$1);
                this.S.b($$2);
                $$5.a($$1, $$2);
                for (int $$10 = 0; $$10 < 6; $$10++) {
                    switch ($$10) {
                        case 0:
                            this.t.v($$7);
                            this.t.w(0.0f);
                            break;
                        case 1:
                            this.t.v(($$7 + 90.0f) % 360.0f);
                            this.t.w(0.0f);
                            break;
                        case 2:
                            this.t.v(($$7 + 180.0f) % 360.0f);
                            this.t.w(0.0f);
                            break;
                        case 3:
                            this.t.v(($$7 - 90.0f) % 360.0f);
                            this.t.w(0.0f);
                            break;
                        case 4:
                            this.t.v($$7);
                            this.t.w(-90.0f);
                            break;
                        case 5:
                        default:
                            this.t.v($$7);
                            this.t.w(90.0f);
                            break;
                    }
                    this.t.N = this.t.dL();
                    this.t.O = this.t.dN();
                    $$5.a(true);
                    this.j.a(fla.b);
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e2) {
                    }
                    fls.a($$0, "panorama_" + $$10 + ".png", $$5, $$02 -> {
                    });
                }
                wp $$11 = wp.b($$0.getName()).a(n.UNDERLINE).a($$12 -> {
                    return $$12.a(new wn(wn.a.OPEN_FILE, $$0.getAbsolutePath()));
                });
                xd a2 = wp.a("screenshot.success", $$11);
                this.t.w($$6);
                this.t.v($$7);
                this.t.O = $$8;
                this.t.N = $$9;
                this.j.b(true);
                this.S.a($$3);
                this.S.b($$4);
                $$5.a($$3, $$4);
                this.j.c(false);
                h().a(true);
                return a2;
            } catch (Exception $$122) {
                G.error("Couldn't save image", $$122);
                xd a3 = wp.a("screenshot.failure", $$122.getMessage());
                this.t.w($$6);
                this.t.v($$7);
                this.t.O = $$8;
                this.t.N = $$9;
                this.j.b(true);
                this.S.a($$3);
                this.S.b($$4);
                $$5.a($$3, $$4);
                this.j.c(false);
                h().a(true);
                return a3;
            }
        } catch (Throwable th) {
            this.t.w($$6);
            this.t.v($$7);
            this.t.O = $$8;
            this.t.N = $$9;
            this.j.b(true);
            this.S.a($$3);
            this.S.b($$4);
            $$5.a($$3, $$4);
            this.j.c(false);
            h().a(true);
            throw th;
        }
    }

    private wp a(File $$0, int $$1, int $$2, int $$3, int $$4) {
        try {
            ByteBuffer $$5 = feo.a($$1 * $$2 * 3);
            fls $$6 = new fls($$0, $$3, $$4, $$2);
            float $$7 = $$3 / $$1;
            float $$8 = $$4 / $$2;
            float $$9 = $$7 > $$8 ? $$7 : $$8;
            int $$10 = (($$4 - 1) / $$2) * $$2;
            while ($$10 >= 0) {
                int $$11 = 0;
                while ($$11 < $$3) {
                    RenderSystem.setShaderTexture(0, hes.d);
                    float $$12 = ((($$3 - $$1) / 2.0f) * 2.0f) - ($$11 * 2);
                    float $$13 = ((($$4 - $$2) / 2.0f) * 2.0f) - ($$10 * 2);
                    this.j.a($$9, $$12 / $$1, $$13 / $$2);
                    $$5.clear();
                    RenderSystem.pixelStore(GlConst.GL_PACK_ALIGNMENT, 1);
                    RenderSystem.pixelStore(GlConst.GL_UNPACK_ALIGNMENT, 1);
                    RenderSystem.readPixels(0, 0, $$1, $$2, GlConst.GL_BGR, GlConst.GL_UNSIGNED_BYTE, $$5);
                    $$6.a($$5, $$11, $$10, $$1, $$2);
                    $$11 += $$1;
                }
                $$6.a();
                $$10 -= $$2;
            }
            File $$14 = $$6.b();
            feo.a($$5);
            wp $$15 = wp.b($$14.getName()).a(n.UNDERLINE).a($$16 -> {
                return $$16.a(new wn(wn.a.OPEN_FILE, $$14.getAbsolutePath()));
            });
            return wp.a("screenshot.success", $$15);
        } catch (Exception $$162) {
            G.warn("Couldn't save screenshot", $$162);
            return wp.a("screenshot.failure", $$162.getMessage());
        }
    }

    @Nullable
    public arr aK() {
        return this.aa.get();
    }

    public hfx aL() {
        return this.av;
    }

    @Nullable
    public fug aM() {
        return this.ba;
    }

    public fzc aN() {
        return this.aM;
    }

    public fey aO() {
        return this.S;
    }

    public fem aP() {
        return this.bh;
    }

    public fpc aQ() {
        return this.m.k();
    }

    public gmh aR() {
        return this.U;
    }

    public void a(int $$0) {
        this.aD.a($$0);
    }

    public gfa aS() {
        return this.aD.e().get();
    }

    public boolean aT() {
        return bt().flag(UserApiService.UserFlag.PROFANITY_FILTER_ENABLED);
    }

    public void aU() {
        this.aM.a();
        w().a();
    }

    @Nullable
    public azm aV() {
        return azm.a(this.ay.getServicesKeySet(), ServicesKeyType.PROFILE_KEY);
    }

    public boolean aW() {
        return !this.ay.getServicesKeySet().keys(ServicesKeyType.PROFILE_KEY).isEmpty();
    }

    public flh aX() {
        return this.ac;
    }

    public void a(flh $$0) {
        this.ac = $$0;
    }

    public flb aY() {
        return this.bt;
    }

    public ggu aZ() {
        return this.bu;
    }

    public ghj ba() {
        return this.bv;
    }

    public fik bb() {
        return this.aQ;
    }

    public glf bc() {
        return this.aR;
    }

    public fkx bd() {
        return this.bw;
    }

    public far be() {
        return this.bx;
    }

    private float a(float $$0) {
        if (this.s != null) {
            bsu $$1 = this.s.u();
            if ($$1.i()) {
                return Math.max($$0, $$1.g());
            }
        }
        return $$0;
    }

    public hbn bf() {
        return this.W;
    }

    /* loaded from: 1.21.4.jar:flk$a.class */
    public enum a {
        ENABLED(wo.a) { // from class: flk.a.1
            @Override // flk.a
            public boolean a(boolean $$0) {
                return true;
            }
        },
        DISABLED_BY_OPTIONS(wp.c("chat.disabled.options").a(n.RED)) { // from class: flk.a.2
            @Override // flk.a
            public boolean a(boolean $$0) {
                return false;
            }
        },
        DISABLED_BY_LAUNCHER(wp.c("chat.disabled.launcher").a(n.RED)) { // from class: flk.a.3
            @Override // flk.a
            public boolean a(boolean $$0) {
                return $$0;
            }
        },
        DISABLED_BY_PROFILE(wp.a("chat.disabled.profile", wp.d(flk.F.n.I.h())).a(n.RED)) { // from class: flk.a.4
            @Override // flk.a
            public boolean a(boolean $$0) {
                return $$0;
            }
        };

        static final wp e = wp.c("chat.disabled.profile.moreInfo");
        private final wp f;

        public abstract boolean a(boolean z);

        a(wp $$0) {
            this.f = $$0;
        }

        public wp a() {
            return this.f;
        }
    }

    /* loaded from: 1.21.4.jar:flk$b.class */
    static final class b extends Record {
        private final fgl a;
        private final gam.c b;

        b(fgl $$0, gam.c $$1) {
            this.a = $$0;
            this.b = $$1;
        }

        @Override // java.lang.Record
        public final String toString() {
            return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, b.class), b.class, "realmsClient;quickPlayData", "FIELD:Lflk$b;->a:Lfgl;", "FIELD:Lflk$b;->b:Lgam$c;").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final int hashCode() {
            return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, b.class), b.class, "realmsClient;quickPlayData", "FIELD:Lflk$b;->a:Lfgl;", "FIELD:Lflk$b;->b:Lgam$c;").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final boolean equals(Object $$0) {
            return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, b.class, Object.class), b.class, "realmsClient;quickPlayData", "FIELD:Lflk$b;->a:Lfgl;", "FIELD:Lflk$b;->b:Lgam$c;").dynamicInvoker().invoke(this, $$0) /* invoke-custom */;
        }

        public fgl a() {
            return this.a;
        }

        public gam.c b() {
            return this.b;
        }
    }

    @Nullable
    public static String bg() {
        return System.getProperty("minecraft.launcher.brand");
    }
}
